package com.mydigilaw.beta_mydigilaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Corporate_Law extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate__law);

        t1=(TextView)findViewById(R.id.tv_company_law);
        t2=(TextView)findViewById(R.id.tv_labour_law);
        t3=(TextView)findViewById(R.id.tv_taxation_law);
        t4=(TextView)findViewById(R.id.tv_banking_law);
        t5=(TextView)findViewById(R.id.tv_customs_law);
        t6=(TextView)findViewById(R.id.tv_online_law);
        t7=(TextView)findViewById(R.id.tv_copyright_law);
        t8=(TextView)findViewById(R.id.tv_cyber_law);
        t9=(TextView)findViewById(R.id.tv_arbitration_law);
        t10=(TextView)findViewById(R.id.tv_wildlife_law);
        t11=(TextView)findViewById(R.id.tv_entertainment_law);
        t12=(TextView)findViewById(R.id.tv_commercial_law);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Company.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Labour.class);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Taxation.class);
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Banking.class);
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Customs.class);
                startActivity(i);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Online_Crime.class);
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Copyright.class);
                startActivity(i);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Cyber.class);
                startActivity(i);
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Arbitration.class);
                startActivity(i);
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_wildlife.class);
                startActivity(i);
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Entertainment.class);
                startActivity(i);
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Corporate_Law.this,Law_Commercial.class);
                startActivity(i);
            }
        });

    }
}
