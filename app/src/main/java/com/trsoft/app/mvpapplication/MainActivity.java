package com.trsoft.app.mvpapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.addItemDecoration(new RecycleViewDivider(this,LinearLayoutManager.HORIZONTAL));
        rv.setLayoutManager(manager);
        ArrayList<String> list = new ArrayList<>();
       for (int i=0;i<5;i++){
           list.add("aaa"+5);
       }
        rv.setAdapter(new RvAdapter(list,R.layout.item_rv));
    }
}
