package com.nakdevelopment.nakrupa.simpletodo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SimpleTodo.db";

    //CREATE AND DECLARE FIELDS IN NEW TABLE.
    private static final String SQL_CREATE_TODO_TABLE = "CREATE TABLE " + DbDef.TodoList.TABLE_NAME + " (" + DbDef.TodoList._ID + " INTEGER PRIMARY KEY," + DbDef.TodoList.COLUMN_NAME + " TEXT)";
    private static final String SQL_CREATE_TODO_ITEM_TABLE = "CREATE TABLE " + DbDef.TodoListItem.TABLE_NAME + " (" + DbDef.TodoList._ID + " INTEGER PRIMARY KEY," + DbDef.TodoList.COLUMN_NAME + " TEXT)";



    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //THIS IS A TEST METHOD
    public void deleteAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DbDef.TodoList.TABLE_NAME, null, null);
        db.close();
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TODO_TABLE);
        db.execSQL(SQL_CREATE_TODO_ITEM_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}