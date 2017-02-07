package com.nakdevelopment.nakrupa.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by NAKRUPA on 2/6/2017.
 */
public class CreateTodoList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_todo_list);



        Button create_tdl_btn = (Button) findViewById(R.id.create_tdl_btn);
    }

    //Method sends back String array with database information, mainactivity calls AsyncTask.
    //Validation on all fields.
    public void create_new_tdl(View view) {
        EditText tdl_title = (EditText) findViewById(R.id.tdl_title);
        String tdl_title_str = tdl_title.getText().toString();
        System.out.println(tdl_title_str);

        Intent createList = new Intent(getBaseContext(), MainActivity.class);
        createList.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        createList.putExtra("tdl_title", tdl_title_str);
        startActivity(createList);
    }
}
