package com.example.tuitam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SendEmailActivity extends AppCompatActivity {

    EditText textEmailAddress,textInputSubject,textInputMsg;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        textEmailAddress=findViewById(R.id.textEmailAddress);
        textInputSubject=findViewById(R.id.textInputSubject);
        textInputMsg=findViewById(R.id.textInputMsg);
        btnSend=findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recipient = textEmailAddress.getText().toString().trim();
                String subject = textInputSubject.getText().toString().trim();
                String message = textInputMsg.getText().toString().trim();

                sendEmail(recipient,subject,message);

            }
        });

    }

    private void sendEmail(String recipient, String subject, String message) {
        Intent mEmailIntent = new Intent(Intent.ACTION_SEND);
        mEmailIntent.setData(Uri.parse("mailto:"));
        mEmailIntent.setType("text/plain");
        mEmailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{recipient});
        mEmailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        mEmailIntent.putExtra(Intent.EXTRA_TEXT,message);

        try {
            startActivity(Intent.createChooser(mEmailIntent,"Wybierz aplikacje"));
        }
        catch (Exception e) {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}