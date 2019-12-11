package com.itschool.project.itcubeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;



public class StartActivity extends AppCompatActivity {
    RelativeLayout startActivity;
    AnimationDrawable animationBackground;
    Button enterBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        startActivity = findViewById(R.id.ac_start);
        enterBt = findViewById(R.id.enter_bt);
        animationBackground = (AnimationDrawable) startActivity.getBackground();
        animationBackground.setEnterFadeDuration(2000);
        animationBackground.setExitFadeDuration(2000);
        enterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(StartActivity.this, MainActivity.class);
                StartActivity.this.startActivity(myInt);
            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();
        if (animationBackground != null && !animationBackground.isRunning()) {
            animationBackground.start();
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        if (animationBackground != null && animationBackground.isRunning()) {
            animationBackground.stop();
        }
    }


    public void goToMain(){}
}
