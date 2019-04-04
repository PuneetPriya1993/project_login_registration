package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.login.models.Student;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    private ListView lv1;
    private ArrayList<Student> studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    private void initData()
    {

    }


}
