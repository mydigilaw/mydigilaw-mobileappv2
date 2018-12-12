package com.mydigilaw.beta_mydigilaw;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class First_Information_Form extends AppCompatActivity {

    Typeface custom_font_2,custom_font_3;
    AssetManager am;

    TextView t1;
    EditText e1,e2,e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__information__form);

        t1=(TextView)findViewById(R.id.headingtv);
        e1=(EditText)findViewById(R.id.edt_1);
        e2=(EditText)findViewById(R.id.edt_2);
        e3=(EditText)findViewById(R.id.edt_3);
        e4=(EditText)findViewById(R.id.edt_4);
        e5=(EditText)findViewById(R.id.edt_5);



        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
        t1.setTypeface(custom_font_2);
        e1.setTypeface(custom_font_2);
        e2.setTypeface(custom_font_2);
        e3.setTypeface(custom_font_2);
        e4.setTypeface(custom_font_2);
        e5.setTypeface(custom_font_2);
    }
}
