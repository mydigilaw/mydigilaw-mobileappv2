package com.mydigilaw.beta_mydigilaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Personal_Law extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__law);

        t1=(TextView)findViewById(R.id.tv_maintanence_law);
        t2=(TextView)findViewById(R.id.tv_divorce_law);
        t3=(TextView)findViewById(R.id.tv_property_law);
        t4=(TextView)findViewById(R.id.tv_disputes_law);
        t5=(TextView)findViewById(R.id.tv_personal_law);
        t6=(TextView)findViewById(R.id.tv_online_law);
        t7=(TextView)findViewById(R.id.tv_passport_law);
        t8=(TextView)findViewById(R.id.tv_councelling_law);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Maintence.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Divorce.class);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Property.class);
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Disputes.class);
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Personal_Banking.class);
                startActivity(i);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Online_Crime.class);
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Passport.class);
                startActivity(i);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Personal_Law.this,Law_Councelling.class);
                startActivity(i);
            }
        });
    }
}
