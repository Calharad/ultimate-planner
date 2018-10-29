package com.apps.adudek.planner.database.entities.schoolDb;

import com.apps.adudek.planner.database.entities.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

public class School implements Entity {

    public static final String _TABLE = "school";

    public static final String _ID = "id_school";

    public static final String _NAME = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChildArray<SchoolYear> getSchoolYearChildren() {
        return schoolYearChildren;
    }

    private ChildArray<SchoolYear> schoolYearChildren = new ChildArray<>();

    private String name;
}
