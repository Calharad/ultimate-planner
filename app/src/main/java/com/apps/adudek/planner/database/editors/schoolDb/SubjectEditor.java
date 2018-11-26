package com.apps.adudek.planner.database.editors.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.schoolDb.School;
import com.apps.adudek.planner.database.entities.schoolDb.Subject;

public class SubjectEditor extends EntityEditor<Subject> {

    public SubjectEditor(Subject entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Subject._NAME);
        if(index>=0)
        {
            entity.setName(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Subject._MANDATORY);
        if(index>=0)
        {
            entity.setMandatory(cursor.getInt(index)>0);
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Subject._GRADE);
        if(index>=0)
        {
            entity.setFinalGrade(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Subject._SEM_GRADE);
        if(index>=0)
        {
            entity.setSemesteryGrade(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setSemesteryGrade(null);
        entity.setFinalGrade(null);

    }
}
