package com.apps.adudek.planner.database.editors.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.studentDb.Module;
import com.apps.adudek.planner.others.DateConverter;

public class ModuleEditor extends EntityEditor<Module> {

    public ModuleEditor(Module entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Module._B_HOUR);
        if(index>=0)
        {
            entity.setBeginHour(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.HOUR_FORMAT));
        }

        index = cursor.getColumnIndex(Module._E_HOUR);
        if(index>=0)
        {
            entity.setEndHour(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.HOUR_FORMAT));
        }

        index = cursor.getColumnIndex(Module._FREQ);
        if(index>=0)
        {
            entity.setFrequency(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(Module._MANDATORY);
        if(index>=0)
        {
            entity.setMandatory(cursor.getInt(index)>0);
        }

        index = cursor.getColumnIndex(Module._WEEK_DAY);
        if(index>=0)
        {
            entity.setWeekDay(cursor.getInt(index));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index = cursor.getColumnIndex(Module._GRADE);
        if(index>=0)
        {
            entity.setFinalGrade(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setFinalGrade(null);

    }
}
