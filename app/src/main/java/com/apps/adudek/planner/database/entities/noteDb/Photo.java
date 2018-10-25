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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBytecode(byte[] bytecode) {
        this.bytecode = bytecode;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getBytecode() {
        return bytecode;
    }

    public float getScale() {
        return scale;
    }

    private String description;

    //TODO: get info about using Images

    private byte[] bytecode;

    private float scale;
}
