package com.apps.adudek.planner.database.editors.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.schoolDb.School;

public class SchoolEditor extends EntityEditor<School> {

    public SchoolEditor(School entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index = cursor.getColumnIndex(School._NAME);

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
