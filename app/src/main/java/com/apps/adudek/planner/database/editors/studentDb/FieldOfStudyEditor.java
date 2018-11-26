package com.apps.adudek.planner.database.editors.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.studentDb.FieldOfStudy;

public class FieldOfStudyEditor extends EntityEditor<FieldOfStudy> {

    public FieldOfStudyEditor(FieldOfStudy entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index = cursor.getColumnIndex(FieldOfStudy._NAME);
        if(index>=0)
        {
            entity.setName(cursor.getString(index));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

    }

    @Override
    public void clearUselessData() {

    }
}
