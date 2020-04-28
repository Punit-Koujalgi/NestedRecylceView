package com.punitk.nested_recylce_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdaptor mainAdaptor=new MainAdaptor(this);
        mainAdaptor.setmList(new ArrayList<String>(){{
            add("Punit K");
            add("Pavan K");
            add("Priyanka K");
            add("Shraddha");
            add("Amma");
            add("Pappa");
        }});
        recyclerView.setAdapter(mainAdaptor);

    }
}
