package com.corp.adams.meteo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView img = (ImageView) findViewById(R.id.myImage);
        img.setBackgroundResource(R.drawable.background);
        AnimationDrawable anim = (AnimationDrawable) img.getBackground();
        anim.start();
    }
}
