package com.mydigilaw.beta_mydigilaw;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    Typeface custom_font_2,custom_font_3;
    TextView tv1,tv2,tv3;
    AnimationDrawable animationDrawable;
    AssetManager am;
    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        tv1=(TextView)findViewById(R.id.lblHeader);

        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");

        tv1.setTypeface(custom_font_2);

        new Handler().postDelayed(new Runnable()
        {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}
