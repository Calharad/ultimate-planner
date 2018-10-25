package com.apps.adudek.planner.database.entities.eventDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.others.DateConverter;

import java.util.Date;

public class Event implements Entity {

    public static final String _TABLE = "event";

    public static final String _ID = "id_event";

    public static final String _TITLE = "title";

    public static final String _DESC = "description";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public ChildArray<EventReminder> getEventReminderChildren() {
        return eventReminderChildren;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    private String title;

    private String description;

    private Date beginDate;

    private Date endDate;

    private ChildArray<EventReminder> eventReminderChildren = new ChildArray<>();
}
