package com.apps.adudek.planner.database.editors.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.noteDb.ToDoList;

public class ToDoListEditor extends EntityEditor<ToDoList> {

    public ToDoListEditor(ToDoList entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(ToDoList._POS_X);
        if(index>=0)
        {
            entity.setPosX(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(ToDoList._POS_Y);
        if(index>=0)
        {
            entity.setPosY(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(ToDoList._SIZE_X);
        if(index>=0)
        {
            entity.setSizeX(cursor.getInt(index));
        }

        index = cursor.getColumnIndex(ToDoList._TITLE);
        if(index>=0)
        {
            entity.setTitle(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setTitle(null);
        entity.setPosX(-1);
        entity.setSizeX(-1);
        entity.setPosY(-1);

    }
}
