package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.others.DateConverter;

import java.util.Date;

public class Note implements Entity {

    public static final String _TABLE = "note";

    public static final String _ID = "id_note";

    public static final String _TITLE = "title";

    public static final String _DESC = "description";

    public static final String _DATE = "date";

    public ChildArray<Text> getNoteChildren() {
        return textChildren;
    }

    public ChildArray<Photo> getPhotoChildren() {
        return photoChildren;
    }

    public ChildArray<ToDoList> getToDoListChildren() {
        return toDoListChildren;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    private String title;

    private String description;

    private Date date;

    private ChildArray<ToDoList> toDoListChildren = new ChildArray<>();

    private ChildArray<Photo> photoChildren = new ChildArray<>();

    private ChildArray<Text> textChildren = new ChildArray<>();
}
