package com.apps.adudek.planner.database.entities.eventDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class EventReminder implements Entity {

    public static final String _TABLE = "event_reminder";

    public static final String _ID = "id_reminder";

    public static final String _EVENT_ID = "event_id_event";

    public static final String _REMIND_DATE = "remind_date";

    public static final String _DESC = "description";

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public String getDescription() {
        return description;
    }

    private Date remindDate;

    private String description;
}
