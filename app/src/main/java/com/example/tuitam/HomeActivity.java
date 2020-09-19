package com.example.tuitam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView cardhome;
    CardView cardonas;
    CardView cardoferta;
    CardView cardgaleria;
    CardView cardcontact;
    CardView cardcalendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardhome = findViewById(R.id.cardhome);
        cardonas = findViewById(R.id.cardonas);
        cardoferta = findViewById(R.id.cardoferta);
        cardgaleria = findViewById(R.id.cardgaleria);
        cardcontact = findViewById(R.id.cardcontact);
        cardcalendar = findViewById(R.id.cardcalendar);

        cardhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,HomeActivity.class));
            }
        });
        cardonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,OnasActivity.class));
            }
        });
        cardoferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,OfertaActivity.class));
            }
        });
        cardgaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,GaleriaActivity.class));
            }
        });
        cardgaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,GaleriaActivity.class));
            }
        });
        cardcalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,KalendarzActivity.class));
            }
        });


    }
}