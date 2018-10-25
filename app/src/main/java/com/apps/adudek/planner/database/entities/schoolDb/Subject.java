package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.database.entities.eventDb.Event;
import com.apps.adudek.planner.database.entities.noteDb.Note;

public class Subject implements Entity {

    public static final String _TABLE = "subject";

    public static final String _ID = "id_subject";

    public static final String _SCHOOL_Y_ID = "school_year_id_school_year";

    public static final String _NAME = "name";

    public static final String _SEM_GRADE = "semestery_grade";

    public static final String _GRADE = "final_grade";

    public static final String _MANDATORY = "mandatory";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public String getSemesteryGrade() {
        return semesteryGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public void setSemesteryGrade(String semesteryGrade) {
        this.semesteryGrade = semesteryGrade;
    }

    public boolean isMandatory()
    {
        return mandatory;
    }

    public ChildArray<Note> getNoteChildren() {
        return noteChildren;
    }

    public ChildArray<Event> getEventChildren() {
        return eventChildren;
    }

    public ChildArray<Grade> getGradeChildren() {
        return gradeChildren;
    }

    public ChildArray<Lesson> getLessonChildren() {
        return lessonChildren;
    }

    private String name;

    private String semesteryGrade;

    private String finalGrade;

    private boolean mandatory;

    private ChildArray<Note> noteChildren = new ChildArray<>();

    private ChildArray<Event> eventChildren = new ChildArray<>();

    private ChildArray<Grade> gradeChildren = new ChildArray<>();

    private ChildArray<Lesson> lessonChildren = new ChildArray<>();
}
