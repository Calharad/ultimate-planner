package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.others.DateConverter;

import java.util.Date;

public class SchoolYear implements Entity {

    public static final String _TABLE = "school_year";

    public static final String _ID = "id_school_year";

    public static final String _SCHOOL_ID = "school_id_school";

    public static final String _YEAR_NUM = "year_number";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public static final String _SEM_E_DATE = "semestery_end_date";

    public Date getEndDate() {
        return endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getSemesteryEndDate() {
        return semesteryEndDate;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setSemesteryEndDate(Date semesteryEndDate) {
        this.semesteryEndDate = semesteryEndDate;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public ChildArray<Subject> getSubjectChildren() {
        return subjectChildren;
    }

    private int yearNumber;

    private Date beginDate;

    private Date endDate;

    private Date semesteryEndDate;

    private ChildArray<Subject> subjectChildren = new ChildArray<>();

}
