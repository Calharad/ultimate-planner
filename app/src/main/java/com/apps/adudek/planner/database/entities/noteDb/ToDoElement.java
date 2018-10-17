package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class ToDoElement implements Entity {

    public static final String _TABLE = "todo_element";

    public static final String _ID = "id_todo_element";

    public static final String _TODO_LIST_ID = "todo_list_id_todo_list";

    public static final String _TEXT = "text";

    public static final String _PRIORITY = "priority";

    public static final String _DONE = "done";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int ToDoListId;

    private String text;

    private int priority;

    private boolean done;
}
