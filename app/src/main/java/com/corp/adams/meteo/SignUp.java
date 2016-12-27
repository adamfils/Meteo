package com.corp.adams.meteo;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ImageView img = (ImageView) findViewById(R.id.myImage);
        img.setBackgroundResource(R.drawable.background);
        AnimationDrawable anim = (AnimationDrawable) img.getBackground();
        anim.start();
    }
    public void registeruser(View v){
        Intent reguser = new Intent(this,Userprofile.class);
        startActivity(reguser);
    }
}
