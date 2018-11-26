package com.apps.adudek.planner.database.entities.noteDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.Entity;

public class ToDoElement extends Entity {

    public static final String _TABLE = "todo_element";

    public static final String _ID = "id_todo_element";

    public static final String _TODO_LIST_ID = "todo_list_id_todo_list";

    public static final String _TEXT = "text";

    public static final String _PRIORITY = "priority";

    public static final String _DONE = "done";

    public void setText(@Nullable String text) {
        this.text = text;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }

    public Boolean isDone()
    {
        return done;
    }

    private String text = null;

    private int priority = -1;

    private Boolean done = null;
}
