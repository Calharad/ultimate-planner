package com.apps.adudek.planner.database.editors.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.schoolDb.Lesson;
import com.apps.adudek.planner.others.DateConverter;

public class LessonEditor extends EntityEditor<Lesson> {

    public LessonEditor(Lesson entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index = cursor.getColumnIndex(Lesson._B_DATE);
        if(index>=0)
        {
            entity.setBeginDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(Lesson._E_DATE);
        if(index>=0)
        {
            entity.setEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index = cursor.getColumnIndex(Lesson._NOTE);
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
