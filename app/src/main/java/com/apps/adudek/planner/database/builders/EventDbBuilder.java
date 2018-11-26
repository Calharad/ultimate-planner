package com.apps.adudek.planner.database.builders;

import com.apps.adudek.planner.database.entities.eventDb.Event;

public class EventDbBuilder implements DbBuilder {

    @Override
    public void init() {

        event = new Event();

    }



    @Override
    public void build() {

    }

    Event event = null;
}
