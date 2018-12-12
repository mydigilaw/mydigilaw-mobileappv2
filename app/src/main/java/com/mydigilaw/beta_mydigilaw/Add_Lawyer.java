package com.mydigilaw.beta_mydigilaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Add_Lawyer extends AppCompatActivity {

    Spinner s;
    String [] s_item={"Internal","External  "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__lawyer);

        s=(Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(Add_Lawyer.this,android.R.layout.simple_spinner_item,s_item);
        s.setAdapter(ad);
    }
}
