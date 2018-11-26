package com.apps.adudek.planner.database.entities.studentDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.database.entities.eventDb.Event;
import com.apps.adudek.planner.database.entities.noteDb.Note;

public class SSubject extends Entity {

    public static final String _TABLE = "subject";

    public static final String _ID = "id_subject";

    public static final String _SEM_ID = "semestery_id_semestery";

    public static final String _NAME = "name";

    public static final String _PRIORITY = "priority";

    public static final String _GRADE = "final_grade";

    public static final String _MANDATORY = "mandatory";

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public void setFinalGrade(@Nullable String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public ChildArray<Event> getEventChildren() {
        return eventChildren;
    }

    public ChildArray<Note> getNoteChildren() {
        return noteChildren;
    }

    public ChildArray<Module> getModuleChildren() {
        return moduleChildren;
    }

    private String name;

    private int priority;

    private String finalGrade;

    private boolean mandatory;

    private ChildArray<Module> moduleChildren = new ChildArray<>();

    private ChildArray<Event> eventChildren = new ChildArray<>();

    private ChildArray<Note> noteChildren = new ChildArray<>();

}
