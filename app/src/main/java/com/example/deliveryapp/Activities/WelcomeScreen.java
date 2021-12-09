package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.deliveryapp.R;
import com.example.deliveryapp.Utils.ViewUtils;

public class WelcomeScreen extends AppCompatActivity {
TextView profileid,welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        ViewUtils mViewUtils = new ViewUtils(getApplicationContext());

        profileid=mViewUtils.createTextView(findViewById(R.id.profileid),false);
        welcome=mViewUtils.createTextView(findViewById(R.id.welcome),true);
        Thread thread = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(3 * 1000);

                    // After 5 seconds redirect to another intent
                    Intent i = new Intent(getBaseContext(), logins.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        thread.start();
    }
}