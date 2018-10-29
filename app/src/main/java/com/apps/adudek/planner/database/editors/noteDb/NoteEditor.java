package com.apps.adudek.planner.database.editors.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.noteDb.Note;
import com.apps.adudek.planner.others.DateConverter;

public class NoteEditor extends EntityEditor<Note> {

    public NoteEditor(Note entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Note._TITLE);
        if(index >=0)
        {
            entity.setTitle(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Note._DATE);
        if(index>=0)
        {
            entity.setDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Note._DESC);
        if(index>=0)
        {
            entity.setDescription(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setDescription(null);

    }
}
