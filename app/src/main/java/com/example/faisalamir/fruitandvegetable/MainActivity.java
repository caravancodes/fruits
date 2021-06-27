package com.example.faisalamir.fruitandvegetable;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView play_apple = (ImageView) findViewById(R.id.button_apple);
        ImageView play_banana = (ImageView) findViewById(R.id.button_banana);
        ImageView play_cherry = (ImageView) findViewById(R.id.button_cherry);
        ImageView play_grape = (ImageView) findViewById(R.id.button_grape);
        ImageView play_lemon = (ImageView) findViewById(R.id.button_lemon);
        ImageView play_orange = (ImageView) findViewById(R.id.button_orange);
        ImageView play_pear = (ImageView) findViewById(R.id.button_pear);
        ImageView play_strawberry = (ImageView) findViewById(R.id.button_strawberry);

        final MediaPlayer pl_apple = MediaPlayer.create(MainActivity.this,R.raw.apple);
        final MediaPlayer pl_banana = MediaPlayer.create(MainActivity.this,R.raw.banana);
        final MediaPlayer pl_cherry = MediaPlayer.create(MainActivity.this,R.raw.cherry);
        final MediaPlayer pl_grape = MediaPlayer.create(MainActivity.this,R.raw.grape);
        final MediaPlayer pl_lemon = MediaPlayer.create(MainActivity.this,R.raw.lemon);
        final MediaPlayer pl_orange = MediaPlayer.create(MainActivity.this,R.raw.orange);
        final MediaPlayer pl_pear = MediaPlayer.create(MainActivity.this,R.raw.pear);
        final MediaPlayer pl_stawberry = MediaPlayer.create(MainActivity.this,R.raw.strawberry);

        play_apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_apple.start();
            }
        });

        play_banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_banana.start();
            }
        });

        play_cherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_cherry.start();
            }
        });

        play_grape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_grape.start();
            }
        });

        play_lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_lemon.start();
            }
        });

        play_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_orange.start();
            }
        });

        play_pear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_pear.start();
            }
        });

        play_strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_stawberry.start();
            }
        });



    }

}
