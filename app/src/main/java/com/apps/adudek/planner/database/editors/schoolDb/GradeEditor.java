package com.apps.adudek.planner.database.editors.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.schoolDb.Grade;

public class GradeEditor extends EntityEditor<Grade> {

    public GradeEditor(Grade entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Grade._DESC);
        if(index>=0)
        {
            entity.setDescription(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Grade._PRIORITY);
        if(index>=0)
        {
            entity.setPriority(cursor.getInt(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setPriority(-1);
        entity.setDescription(null);

    }
}
