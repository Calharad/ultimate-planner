package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class Photo implements Entity {

    public static final String _TABLE = "photo";

    public static final String _ID = "id_photo";

    public static final String _NOTE_ID = "note_id_note";

    public static final String _DESC = "description";

    public static final String _PHOTO = "photo_bitcode";

    public static final String _SCALE = "scale";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO:getter/setter + other

    private int id;

    private int noteId;

    private String description;

    //TODO: get info about using Images

    private String bytecode;

    private float scale;
}
