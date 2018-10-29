package com.apps.adudek.planner.database.editors.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.studentDb.SSubject;

public class SSubjectEditor extends EntityEditor<SSubject> {

    public SSubjectEditor(SSubject entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(SSubject._NAME);
        if(index>=0)
        {
            entity.setName(cursor.getString(index));
        }

        index = cursor.getColumnIndex(SSubject._MANDATORY);
        if(index>=0)
        {
            entity.setMandatory(cursor.getInt(index)>0);
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(SSubject._GRADE);
        if(index>=0)
        {
            entity.setFinalGrade(cursor.getString(index));
        }

        index = cursor.getColumnIndex(SSubject._PRIORITY);
        if(index>=0)
        {
            entity.setPriority(cursor.getInt(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setPriority(-1);
        entity.setFinalGrade(null);

    }
}
