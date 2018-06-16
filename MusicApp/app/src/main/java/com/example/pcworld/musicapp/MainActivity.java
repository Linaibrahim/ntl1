package com.example.pcworld.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button showList;
    Button playNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showList = (Button) findViewById(R.id.showall);
        playNow = (Button) findViewById(R.id.goToPlay);
        showList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity = new Intent(MainActivity.this, ListSongs.class);
                startActivity(listActivity);
            }
        });
        playNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playNow = new Intent(MainActivity.this, PlayNow.class);
                startActivity(playNow);
            }
        });
    }
}
