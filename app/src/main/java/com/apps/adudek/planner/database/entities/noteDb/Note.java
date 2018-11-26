package com.apps.adudek.planner.database.entities.noteDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Note extends Entity {

    public static final String _TABLE = "note";

    public static final String _ID = "id_note";

    public static final String _TITLE = "title";

    public static final String _DESC = "description";

    public static final String _DATE = "\"date\"";

    public ChildArray<Text> getTextChildren() {
        return textChildren;
    }

    public ChildArray<Photo> getPhotoChildren() {
        return photoChildren;
    }

    public ChildArray<ToDoList> getToDoListChildren() {
        return toDoListChildren;
    }

    public void setDescription(@Nullable String description) {
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

    private String title = null;

    private String description = null;

    private Date date = null;

    private ChildArray<ToDoList> toDoListChildren = new ChildArray<>();

    private ChildArray<Photo> photoChildren = new ChildArray<>();

    private ChildArray<Text> textChildren = new ChildArray<>();
}
