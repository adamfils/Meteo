package com.corp.adams.meteo;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class Getstarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        ImageView img = (ImageView) findViewById(R.id.myImage);
        img.setBackgroundResource(R.drawable.background);
        AnimationDrawable anim = (AnimationDrawable) img.getBackground();
        anim.start();

    }
    public void singupactive(View singupactive){
        Intent signup = new Intent(this,SignUp.class);
        startActivity(signup);
    }
    public void loginactive(View loginactive){
        Intent login = new Intent(this,Login.class);
        startActivity(login);
    }
    public void skipbtn(View skipbtn){
        Intent skip = new Intent(this,Choose.class);
        startActivity(skip);
    }
}
