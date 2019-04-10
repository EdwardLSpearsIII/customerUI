package com.example.admin1.firstlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    List<activity_customer_home> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        list = new ArrayList<>();

        list.add(new activity_customer_home(R.drawable.bluesmiley, "Company 1", "098-765-4321", "johndoe@pvamu.edu"));
        list.add(new activity_customer_home(R.drawable.redsmiley, "Company 2", "222-444-3456", "ronaldreagan@pvamu.edu"));
        list.add(new activity_customer_home(R.drawable.smiley, "Company 3", "111-777-2345", "matthewmark@pvamu.edu"));


        listView = (ListView) findViewById(R.id.listView);


    }

    }
