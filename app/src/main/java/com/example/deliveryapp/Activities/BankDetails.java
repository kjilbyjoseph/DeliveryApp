package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.deliveryapp.R;

public class BankDetails extends AppCompatActivity {
TextView continues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);
        continues=findViewById(R.id.next);
        continues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Upload_Adhar_photo.class);
                startActivity(intent);
            }
        });
    }
}