package com.example.tuitam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GaleriaActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int []arr={R.drawable.foto1,R.drawable.foto2,R.drawable.foto3,R.drawable.foto4,R.drawable.foto5,R.drawable.foto6,R.drawable.foto7,R.drawable.foto8,R.drawable.foto9,R.drawable.foto10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        toolbar=findViewById(R.id.app_Bar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager;
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(arr);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

    }
}