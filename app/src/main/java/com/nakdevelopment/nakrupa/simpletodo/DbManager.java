package com.nakdevelopment.nakrupa.simpletodo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NAKRUPA on 2/6/2017.
 */
public class DbManager extends AsyncTask<String, Void, ArrayList<String>>{

    public DbHelper dbh;

    public DbManager(DbHelper dbh) {
        this.dbh = dbh;
    }

    //Perform database operations in a new thread to improve performance.
    @Override
    protected ArrayList<String> doInBackground(String... params) {
        ArrayList<String> result = new ArrayList<String>();

        if(params[0].equals("create_tdl")) {
            System.out.println("Test");
        }
        else

        if(params[0].equals("get_tdl")) {
            SQLiteDatabase ndb = dbh.getReadableDatabase();

            // Define a projection that specifies which columns from the database.
            String[] projection = {
                    DbDef.TodoList._ID,
                    DbDef.TodoList.COLUMN_NAME,
            };

            // How you want the results sorted in the resulting Cursor
            String sortOrder = DbDef.TodoList.COLUMN_NAME + " DESC";

            Cursor cursor = ndb.query(
                    DbDef.TodoList.TABLE_NAME,                // The table to query
                    projection,                               // The columns to return
                    null,                                     // The columns for the WHERE clause
                    null,                                     // The values for the WHERE clause
                    null,                                     // don't group the rows
                    null,                                     // don't filter by row groups
                    sortOrder                                 // The sort order
            );

            while(cursor.moveToNext()) {
                result.add(cursor.getString(cursor.getColumnIndexOrThrow(DbDef.TodoList.COLUMN_NAME)));
            }
            cursor.close();
            return result;
        }
        else

        if(params[0].equals("get_tdl_itm")) {

        }
        return result;
    }
}
