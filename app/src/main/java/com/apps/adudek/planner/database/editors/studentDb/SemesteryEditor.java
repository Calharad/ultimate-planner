package com.apps.adudek.planner.database.editors.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.studentDb.Semestery;
import com.apps.adudek.planner.others.DateConverter;

public class SemesteryEditor extends EntityEditor<Semestery> {

    public SemesteryEditor(Semestery entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Semestery._B_DATE);
        if(index>=0)
        {
            entity.setBeginDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(Semestery._E_DATE);
        if(index>=0)
        {
            entity.setEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(Semestery._SEM_NUM);
        if(index>=0)
        {
            entity.setSemNumber(cursor.getInt(index));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {



    }

    @Override
    public void clearUselessData() {

    }
}
