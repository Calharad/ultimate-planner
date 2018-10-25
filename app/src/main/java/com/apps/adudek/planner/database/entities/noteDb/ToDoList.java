package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

public class ToDoList implements Entity {

    public static final String _TABLE = "todo_list";

    public static final String _ID = "id_todo_list";

    public static final String _NOTE_ID = "note_id_note";

    public static final String _TITLE = "title";

    public static final String _POS_X = "posX";

    public static final String _POS_Y = "posY";

    public static final String _SIZE_X = "sizeX";

    public ChildArray<ToDoElement> getToDoElementChildren() {
        return toDoElementChildren;
    }

    public String getTitle() {
        return title;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    private String title;

    private int posX;

    private int posY;

    private int sizeX;

    private ChildArray<ToDoElement> toDoElementChildren = new ChildArray<>();

}
