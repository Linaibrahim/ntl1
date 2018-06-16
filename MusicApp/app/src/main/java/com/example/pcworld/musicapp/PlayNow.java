package com.example.pcworld.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayNow extends AppCompatActivity {
    Button backeToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);
        backeToList = (Button) findViewById(R.id.backToList);
        backeToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(PlayNow.this, ListSongs.class);
                startActivity(back);
            }
        });
    }
}
