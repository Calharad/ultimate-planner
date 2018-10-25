package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class Grade implements Entity {

    public static final String _TABLE = "grade";

    public static final String _ID = "id_grade";

    public static final String _SUBJECT_ID = "module_id_module";

    public static final String _DESC = "description";

    public static final String _PRIORITY = "priority";

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    private String description;

    private int priority;


}
