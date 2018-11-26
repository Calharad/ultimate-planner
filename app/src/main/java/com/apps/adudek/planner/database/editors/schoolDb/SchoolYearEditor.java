package com.apps.adudek.planner.database.editors.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.schoolDb.School;
import com.apps.adudek.planner.database.entities.schoolDb.SchoolYear;
import com.apps.adudek.planner.others.DateConverter;

public class SchoolYearEditor extends EntityEditor<SchoolYear> {

    public SchoolYearEditor(SchoolYear entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(SchoolYear._B_DATE);
        if(index>=0)
        {
            entity.setBeginDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(SchoolYear._E_DATE);
        if(index>=0)
        {
            entity.setEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(SchoolYear._SEM_E_DATE);
        if(index>=0)
        {
            entity.setSemesteryEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(SchoolYear._YEAR_NUM);
        if(index>=0)
        {
            entity.setYearNumber(cursor.getInt(index));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

    }

    @Override
    public void clearUselessData() {

    }
}
