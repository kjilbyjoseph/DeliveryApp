package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.deliveryapp.R;
import com.example.deliveryapp.Utils.ViewUtils;

public class logins extends AppCompatActivity {

    TextView register,sendotp,notamember,logintrouble,signinnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logins);
        ViewUtils mViewUtils = new ViewUtils(getApplicationContext());
        mViewUtils.createIconTextView ( findViewById ( R.id.faphone ));

        notamember=mViewUtils.createTextView(findViewById(R.id.notamember),false);
        sendotp=mViewUtils.createTextView(findViewById(R.id.sendotp),true);
        register=mViewUtils.createTextView(findViewById(R.id.Registers),true);
        logintrouble=mViewUtils.createTextView(findViewById(R.id.logintrouble),true);
        signinnow=mViewUtils.createTextView(findViewById(R.id.signinnow),true);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), New_user_Registration.class);
                startActivity(intent);
            }
        });

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), OTP_Verification.class);
                i.putExtra("page","login");
                startActivity(i);
            }
        });
    }
}