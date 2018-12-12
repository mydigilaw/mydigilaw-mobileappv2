package com.mydigilaw.beta_mydigilaw;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Law_Divorce extends AppCompatActivity {


    Typeface custom_font_2;
    AssetManager am;

    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law__divorce);

        t1=(TextView)findViewById(R.id.tvheading_divorce);
        t2=(TextView)findViewById(R.id.tvdesc_divorce);
        t3=(TextView)findViewById(R.id.tvraise_divorce);


       // custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
        t1.setTypeface(custom_font_2);
        t2.setTypeface(custom_font_2);
        t3.setTypeface(custom_font_2);


        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Law_Divorce.this,First_Information_Form.class);
                startActivity(i);
            }
        });


    }
}
