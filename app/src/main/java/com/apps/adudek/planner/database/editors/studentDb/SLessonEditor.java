package com.apps.adudek.planner.database.editors.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.studentDb.SLesson;
import com.apps.adudek.planner.others.DateConverter;

public class SLessonEditor extends EntityEditor<SLesson> {

    public SLessonEditor(SLesson entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(SLesson._B_DATE);
        if(index>=0)
        {
            entity.setBeginDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(SLesson._E_DATE);
        if(index>=0)
        {
            entity.setEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }
    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index = cursor.getColumnIndex(SLesson._NOTE);
        if(index>=0)
        {
            entity.setNote(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setNote(null);

    }
}
