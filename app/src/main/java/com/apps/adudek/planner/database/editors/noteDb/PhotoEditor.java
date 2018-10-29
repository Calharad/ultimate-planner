package com.apps.adudek.planner.database.editors.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.noteDb.Photo;

public class PhotoEditor extends EntityEditor<Photo> {

    public PhotoEditor(Photo entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Photo._DESC);
        if(index>=0)
        {
            entity.setDescription(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Photo._PHOTO);
        if(index>=0)
        {
            entity.setBytecode(cursor.getBlob(index));
        }

        index = cursor.getColumnIndex(Photo._SCALE);
        if(index>=0)
        {
            entity.setScale(cursor.getFloat(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setScale(-1f);
        entity.setBytecode(null);
        entity.setDescription(null);

    }
}
