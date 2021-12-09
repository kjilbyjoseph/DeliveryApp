package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.deliveryapp.R;

public class Upload_Adhar_photo extends AppCompatActivity {
TextView uploadphoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_adhar_photo);
        uploadphoto=findViewById(R.id.uploadphoto);
        uploadphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),WelcomeScreen.class);
                startActivity(i);
            }
        });
    }
}