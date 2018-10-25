package com.apps.adudek.planner.database;

//YYYY-MM-DD HH:MM:SS.SSS date

import com.apps.adudek.planner.database.entities.eventDb.Event;
import com.apps.adudek.planner.database.entities.noteDb.Note;
import com.apps.adudek.planner.database.entities.schoolDb.School;
import com.apps.adudek.planner.database.entities.studentDb.FieldOfStudy;

final class DataMagazine {

    public ChildArray<Event> getEvents() {
        return events;
    }

    public ChildArray<Note> getNotes() {
        return notes;
    }

    public ChildArray<School> getSchools() {
        return schools;
    }

    public ChildArray<FieldOfStudy> getStudies() {
        return studies;
    }

    private ChildArray<Note> notes = new ChildArray<>();

    private ChildArray<Event> events = new ChildArray<>();

    private ChildArray<School> schools = new ChildArray<>();

    private ChildArray<FieldOfStudy> studies = new ChildArray<>();

}
