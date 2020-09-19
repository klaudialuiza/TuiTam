package com.example.tuitam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KontaktActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private TextView textContactUs,textPhoneNr,textEmail;
    private ImageView imageCallUs,sendMail;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);

        toolbar=findViewById(R.id.app_Bar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");

        textContactUs = findViewById(R.id.textContactUs);
        textPhoneNr = findViewById(R.id.textPhoneNr);
        textEmail = findViewById(R.id.textEmail);
        imageCallUs = findViewById(R.id.imageCallUs);
        sendMail = findViewById(R.id.sendMail);

        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KontaktActivity.this,SendEmailActivity.class));
            }
        });

        imageCallUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MakePhoneCall();
            }
        });

    }
    private void MakePhoneCall() {
        String number = textPhoneNr.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(KontaktActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(KontaktActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                MakePhoneCall();
            }
            else {
                Toast.makeText(KontaktActivity.this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
}