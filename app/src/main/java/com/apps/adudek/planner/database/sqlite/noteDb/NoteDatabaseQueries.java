package com.apps.adudek.planner.database.sqlite.noteDb;

import com.apps.adudek.planner.database.entities.noteDb.Note;

class NoteDatabaseQueries {

    static final String CREATE_DATABASE =
            "CREATE TABLE note (\n" +
            "  id_note INTEGER  NOT NULL ,\n" +
            "  title TEXT  NOT NULL  ,\n" +
            "  description TEXT    ,\n" +
            "  \"date\" TEXT      ,\n" +
            "PRIMARY KEY(id_note));\n" +
            "\n" +
            "CREATE TABLE todo_list (\n" +
            "  id_todo_list INTEGER  NOT NULL  ,\n" +
            "  note_id_note INTEGER  NOT NULL  ,\n" +
            "  title TEXT  NOT NULL  ,\n" +
            "  posX INTEGER  NOT NULL  ,\n" +
            "  posY INTEGER    ,\n" +
            "  sizeX INTEGER      ,\n" +
            "PRIMARY KEY(id_todo_list)  ,\n" +
            "  FOREIGN KEY(note_id_note)\n" +
            "    REFERENCES note(id_note)\n" +
            "      ON DELETE NO ACTION\n" +
            "      ON UPDATE NO ACTION);\n" +
            "\n" +
            "CREATE INDEX todo_list_FKIndex1 ON todo_list (note_id_note);\n" +
            "\n" +
            "CREATE TABLE photo (\n" +
            "  id_photo INTEGER  NOT NULL  ,\n" +
            "  note_id_note INTEGER  NOT NULL  ,\n" +
            "  description TEXT    ,\n" +
            "  photo_bitcode BLOB  NOT NULL  ,\n" +
            "  scale REAL  NOT NULL DEFAULT 1   ,\n" +
            "PRIMARY KEY(id_photo, note_id_note)  ,\n" +
            "  FOREIGN KEY(note_id_note)\n" +
            "    REFERENCES note(id_note)\n" +
            "      ON DELETE NO ACTION\n" +
            "      ON UPDATE NO ACTION);\n" +
            "\n" +
            "CREATE INDEX photo_FKIndex1 ON photo (note_id_note);\n" +
            "\n" +
            "CREATE TABLE text (\n" +
            "  id_text INTEGER  NOT NULL  ,\n" +
            "  note_id_note INTEGER  NOT NULL  ,\n" +
            "  text TEXT  NOT NULL  ,\n" +
            "  posX INTEGER  NOT NULL  ,\n" +
            "  posY INTEGER  NOT NULL  ,\n" +
            "  sizeX INTEGER  NOT NULL    ,\n" +
            "PRIMARY KEY(id_text)  ,\n" +
            "  FOREIGN KEY(note_id_note)\n" +
            "    REFERENCES note(id_note)\n" +
            "      ON DELETE NO ACTION\n" +
            "      ON UPDATE NO ACTION);\n" +
            "\n" +
            "CREATE INDEX text_FKIndex1 ON text (note_id_note);\n" +
            "\n" +
            "CREATE TABLE todo_element (\n" +
            "  id_todo_element INTEGER  NOT NULL  ,\n" +
            "  todo_list_id_todo_list INTEGER  NOT NULL  ,\n" +
            "  text TEXT  NOT NULL  ,\n" +
            "  priority INTEGER    ,\n" +
            "  done INTEGER  NOT NULL    ,\n" +
            "PRIMARY KEY(id_todo_element)  ,\n" +
            "  FOREIGN KEY(todo_list_id_todo_list)\n" +
            "    REFERENCES todo_list(id_todo_list)\n" +
            "      ON DELETE NO ACTION\n" +
            "      ON UPDATE NO ACTION);\n" +
            "\n" +
            "CREATE INDEX todo_element_FKIndex1 ON todo_element (todo_list_id_todo_list);";

    static final String OPTIMIZE_DATABASE =
                    "OPTIMIZE TABLE note;\n" +
                    "\n" +
                    "OPTIMIZE TABLE todo_list;\n" +
                    "\n" +
                    "OPTIMIZE TABLE photo;\n" +
                    "\n" +
                    "OPTIMIZE TABLE text;\n" +
                    "\n" +
                    "OPTIMIZE TABLE todo_element;";

    static final String REPAIR_DATABASE =
                    "REPAIR TABLE note;\n" +
                    "\n" +
                    "REPAIR TABLE todo_list;\n" +
                    "\n" +
                    "REPAIR TABLE photo;\n" +
                    "\n" +
                    "REPAIR TABLE text;\n" +
                    "\n" +
                    "REPAIR TABLE todo_element;";

}
