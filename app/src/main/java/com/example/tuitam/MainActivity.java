package com.example.tuitam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    CardView cardhome;
    CardView cardonas;
    CardView cardoferta;
    CardView cardgaleria;
    CardView cardcontact;
    CardView cardcalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.NavigationView);
        toolbar=findViewById(R.id.app_Bar);

        cardhome = findViewById(R.id.cardhome);
        cardonas = findViewById(R.id.cardonas);
        cardoferta = findViewById(R.id.cardoferta);
        cardgaleria = findViewById(R.id.cardgaleria);
        cardcontact = findViewById(R.id.cardcontact);
        cardcalendar = findViewById(R.id.cardcalendar);

        cardhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HomeActivity.class));
            }
        });
        cardonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OnasActivity.class));
            }
        });
        cardoferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OfertaActivity.class));
            }
        });
        cardgaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,GaleriaActivity.class));
            }
        });
        cardcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KontaktActivity.class));
            }
        });
        cardcalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KalendarzActivity.class));
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id==R.id.home) {
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                    return true;
                }
                else
                if (id==R.id.onas) {
                    Intent intent = new Intent(MainActivity.this,OnasActivity.class);
                    startActivity(intent);
                    return true;
                }
                else
                if (id==R.id.oferta) {
                    Intent intent = new Intent(MainActivity.this,OfertaActivity.class);
                    startActivity(intent);
                    return true;
                }
                else
                if (id==R.id.galeria) {
                    Intent intent = new Intent(MainActivity.this,GaleriaActivity.class);
                    startActivity(intent);
                    return true;
                }
                else
                if (id==R.id.kontakt) {
                    Intent intent = new Intent(MainActivity.this,KontaktActivity.class);
                    startActivity(intent);
                    return true;
                }
                else
                if (id==R.id.kalendarz) {
                    Intent intent = new Intent(MainActivity.this,KalendarzActivity.class);
                    startActivity(intent);
                    return true;
                }

                return true;
            }
        });

        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_open_nav);
        actionBar.setTitle("");



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}