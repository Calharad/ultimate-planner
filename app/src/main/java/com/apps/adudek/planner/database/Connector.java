package com.apps.adudek.planner.database;

import com.apps.adudek.planner.database.entities.eventDb.Event;
import com.apps.adudek.planner.database.entities.eventDb.EventReminder;
import com.apps.adudek.planner.database.entities.noteDb.Note;
import com.apps.adudek.planner.database.entities.noteDb.Photo;
import com.apps.adudek.planner.database.entities.noteDb.Text;
import com.apps.adudek.planner.database.entities.noteDb.ToDoElement;
import com.apps.adudek.planner.database.entities.noteDb.ToDoList;
import com.apps.adudek.planner.database.entities.schoolDb.Grade;
import com.apps.adudek.planner.database.entities.schoolDb.Lesson;
import com.apps.adudek.planner.database.entities.schoolDb.School;
import com.apps.adudek.planner.database.entities.schoolDb.SchoolYear;
import com.apps.adudek.planner.database.entities.schoolDb.Subject;
import com.apps.adudek.planner.database.entities.studentDb.FieldOfStudy;
import com.apps.adudek.planner.database.entities.studentDb.Module;
import com.apps.adudek.planner.database.entities.studentDb.SGrade;
import com.apps.adudek.planner.database.entities.studentDb.SLesson;
import com.apps.adudek.planner.database.entities.studentDb.SSubject;
import com.apps.adudek.planner.database.entities.studentDb.Semestery;

public class Connector {

    public static void connect(int id, Semestery child, FieldOfStudy parent)
    {
        parent.getSemesteryChildren().add(id, child);
    }

    public static void connect(int id, SSubject child, Semestery parent)
    {
        parent.getSubjectChildren().add(id,child);
    }

    public static void connect(int id, Event child, SSubject parent)
    {
        parent.getEventChildren().add(id,child);
    }

    public static void connect(int id, Note child, SSubject parent)
    {
        parent.getNoteChildren().add(id, child);
    }

    public static void connect(int id, Module child, SSubject parent)
    {
        parent.getModuleChildren().add(id,child);
    }

    public static void connect(int id, SGrade child, Module parent)
    {
        parent.getGradeChildren().add(id, child);
    }

    public static void connect(int id, SLesson child, Module parent)
    {
        parent.getLessonChildren().add(id, child);
    }

    public static void connect(int id, SchoolYear child, School parent)
    {
        parent.getSchoolYearChildren().add(id,child);
    }

    public static void connect(int id, Subject child, SchoolYear parent)
    {
        parent.getSubjectChildren().add(id, child);
    }

    public static void connect(int id, Grade child, Subject parent)
    {
        parent.getGradeChildren().add(id, child);
    }

    public static void connect(int id, Lesson child, Subject parent)
    {
        parent.getLessonChildren().add(id, child);
    }

    public static void connect(int id, Note child, Subject parent)
    {
        parent.getNoteChildren().add(id, child);
    }

    public static void connect(int id, Event child, Subject parent)
    {
        parent.getEventChildren().add(id, child);
    }

    public static void connect(int id, EventReminder child, Event parent)
    {
        parent.getEventReminderChildren().add(id, child);
    }

    public static void connect(int id, Text child, Note parent)
    {
        parent.getTextChildren().add(id, child);
    }

    public static void connect(int id, Photo child, Note parent)
    {
        parent.getPhotoChildren().add(id, child);
    }

    public static void connect(int id, ToDoList child, Note parent)
    {
        parent.getToDoListChildren().add(id, child);
    }

    public static void connect(int id, ToDoElement child, ToDoList parent)
    {
        parent.getToDoElementChildren().add(id, child);
    }
}
