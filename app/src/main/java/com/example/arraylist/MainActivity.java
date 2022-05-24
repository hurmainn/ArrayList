package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> studentList=new ArrayList<String>();
        studentList.add("Hurmain");
        studentList.add("Fajar");
        studentList.add("Ameena");
        studentList.add("BLA BLA BLA");

        ListView students=findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,studentList);
        students.setAdapter(arrayAdapter);
    }
}