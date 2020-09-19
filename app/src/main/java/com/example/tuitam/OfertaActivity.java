package com.example.tuitam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OfertaActivity extends AppCompatActivity {

    private Toolbar toolbar;

    RecyclerView recyclerView;
    String s1[],s2[];
    int images[] = {R.drawable.foto1,R.drawable.foto2,R.drawable.foto3,R.drawable.foto4,R.drawable.foto5,R.drawable.foto6,
            R.drawable.foto7,R.drawable.foto8,R.drawable.foto9,R.drawable.foto10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta);

        toolbar=findViewById(R.id.app_Bar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");

        recyclerView = findViewById(R.id.recView);

        s1 = getResources().getStringArray(R.array.oferty);
        s2 = getResources().getStringArray(R.array.description);


        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}