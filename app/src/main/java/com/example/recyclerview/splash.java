package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

        MediaPlayer sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        sound = MediaPlayer.create(this, R.raw.rain);
        sound.start();


        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splash.this, MainActivity.class));

            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);

    }

    @Override
    protected void onPause(){
        super.onPause();
        sound.release();
        finish();

    }

}