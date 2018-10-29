package com.apps.adudek.planner.database.entities.noteDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.Entity;

public class Text implements Entity {

    public static final String _TABLE = "text";

    public static final String _ID = "id_text";

    public static final String _NOTE_ID = "note_id_note";

    public static final String _TEXT = "text";

    public static final String _POS_X = "posX";

    public static final String _POS_Y = "posY";

    public static final String _SIZE_X = "sizeX";

    public String getText() {
        return text;
    }

    public void setText(@Nullable String text) {
        this.text = text;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    private String text;

    private int posX;

    private int posY;

    private int sizeX;
}
