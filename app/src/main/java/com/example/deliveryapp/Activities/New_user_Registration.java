package com.example.deliveryapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deliveryapp.R;
import com.example.deliveryapp.Utils.ViewUtils;

public class New_user_Registration extends AppCompatActivity {
TextView verifyusers,registerhere;
ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_registration);

        ViewUtils mViewUtils = new ViewUtils(getApplicationContext());
        mViewUtils.createIconTextView ( findViewById ( R.id.phone ));
        mViewUtils.createIconTextView ( findViewById ( R.id.gmails ));
        mViewUtils.createIconTextView ( findViewById ( R.id.name));

        registerhere=mViewUtils.createTextView(findViewById(R.id.registerhere),true);
        verifyusers=mViewUtils.createTextView(findViewById(R.id.verifyusers),true);

        backarrow=findViewById(R.id.backarrow);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), logins.class);
                startActivity(i);
            }
        });
        verifyusers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),OTP_Verification.class);
                i.putExtra("page","register");
                startActivity(i);
            }
        });
    }
}