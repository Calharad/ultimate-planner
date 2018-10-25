package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

public class FieldOfStudy implements Entity {

    public static final String _TABLE = "field_of_study";

    public static final String _ID = "id_field_of_study";

    public static final String _NAME = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChildArray<Semestery> getSemesteryChildren() {
        return semesteryChildren;
    }

    private String name;

    private ChildArray<Semestery> semesteryChildren = new ChildArray<>();
}
