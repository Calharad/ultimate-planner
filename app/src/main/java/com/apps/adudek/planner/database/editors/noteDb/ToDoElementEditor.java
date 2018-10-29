package com.apps.adudek.planner.database.editors.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.noteDb.ToDoElement;

public class ToDoElementEditor extends EntityEditor<ToDoElement> {

    public ToDoElementEditor(ToDoElement entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

    }

    @Override
    public void setMissingData(Cursor cursor) {


        int index = cursor.getColumnIndex(ToDoElement._DONE);
        if(index>=0)
        {
            entity.setDone(cursor.getInt(index)>0);
        }

        index = cursor.getColumnIndex(ToDoElement._PRIORITY);
        if(index>=0)
        {
            entity.setPriority(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(ToDoElement._TEXT);
        if(index>=0)
        {
            entity.setText(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setText(null);
        entity.setPriority(-1);
        entity.setDone(false);

    }
}
