package com.apps.adudek.planner.database.entities.eventDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

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

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public void setEndDate(@Nullable Date endDate) {
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
