package com.nakdevelopment.nakrupa.simpletodo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by NAKRUPA on 2/6/2017.
 * The Database Definition class defines each table that is to be created in the database.
 */

//CREATE A NEW TABLE DEFINITION FOR EACH TABLE REQUIRED IN THE DATABASE.
public final class DbDef {

    public DbDef() {
    }

    //TodoList Table
    public static class TodoList implements BaseColumns{
        public static final String TABLE_NAME = "todo_list";
        public static final String COLUMN_NAME = "column_one";
    }

    public static class TodoListItem implements BaseColumns{
        public static final String TABLE_NAME = "todo_list";
        public static final String COLUMN_NAME = "column_one";
    }

}
