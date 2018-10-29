package com.apps.adudek.planner.database.editors.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.noteDb.Text;

public class TextEditor extends EntityEditor<Text> {

    public TextEditor(Text entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Text._POS_X);
        if(index>=0)
        {
            entity.setPosX(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(Text._POS_Y);
        if(index>=0)
        {
            entity.setPosY(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(Text._SIZE_X);
        if(index>=0)
        {
            entity.setSizeX(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(Text._TEXT);
        if(index>=0)
        {
            entity.setText(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setText(null);
        entity.setSizeX(-1);
        entity.setPosX(-1);
        entity.setPosY(-1);

    }
}
