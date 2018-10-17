package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class ToDoList implements Entity {

    public static final String _TABLE = "todo_list";

    public static final String _ID = "id_todo_list";

    public static final String _NOTE_ID = "note_id_note";

    public static final String _TITLE = "title";

    public static final String _POS_X = "posX";

    public static final String _POS_Y = "posY";

    public static final String _SIZE_X = "sizeX";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int noteId;

    private String title;

    private int posX;

    private int posY;

    private int sizeX;

}
