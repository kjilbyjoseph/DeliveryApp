package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.deliveryapp.R;

public class OTP_Verification extends AppCompatActivity {
TextView submit;
String page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        submit=findViewById(R.id.submit);
        page=getIntent().getStringExtra("page");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(page.equals("register"))
                {
                    Intent intent = new Intent(getApplicationContext(), Address_Details.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(intent);
                }

            }
        });
    }
}