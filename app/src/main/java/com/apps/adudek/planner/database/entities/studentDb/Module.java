package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Module implements Entity {

    public static final String _TABLE = "module";

    public static final String _ID = "id_module";

    public static final String _SUBJECT_ID = "subject_id_subject";

    public static final String _MANDATORY = "mandatory";

    public static final String _GRADE = "final_grade";

    public static final String _WEEK_DAY = "week_day";

    public static final String _B_HOUR = "begin_hour";

    public static final String _E_HOUR = "end_hour";

    public static final String _FREQ = "frequency";



    public boolean isMandatory()
    {
        return mandatory;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setBeginHour(Date beginHour) {
        this.beginHour = beginHour;
    }

    public void setEndHour(Date endHour) {
        this.endHour = endHour;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public Date getBeginHour() {
        return beginHour;
    }

    public Date getEndHour() {
        return endHour;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public ChildArray<Lesson> getLessonChildren() {
        return lessonChildren;
    }

    public ChildArray<Grade> getGradeChildren() {
        return gradeChildren;
    }

    private boolean mandatory;

    private String finalGrade;

    private int weekDay;

    private Date beginHour;

    private Date endHour;

    private int frequency;

    private ChildArray<Grade> gradeChildren = new ChildArray<>();

    private ChildArray<Lesson> lessonChildren = new ChildArray<>();
}
