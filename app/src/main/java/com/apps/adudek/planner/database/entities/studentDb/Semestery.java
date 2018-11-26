package com.apps.adudek.planner.database.entities.studentDb;

import com.apps.adudek.planner.database.entities.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Semestery extends Entity {

    public static final String _TABLE = "semestery";

    public static final String _ID = "id_semestery";

    public static final String _FIELD_OF_STUDY_ID = "field_of_study_id_field_of_study";

    public static final String _SEM_NUM = "sem_number";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public Date getEndDate() {
        return endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public int getSemNumber() {
        return semNumber;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setSemNumber(int semNumber) {
        this.semNumber = semNumber;
    }

    public ChildArray<SSubject> getSubjectChildren() {
        return subjectChildren;
    }

    private int semNumber;

    private Date beginDate;

    private Date endDate;

    private ChildArray<SSubject> subjectChildren = new ChildArray<>();

}
