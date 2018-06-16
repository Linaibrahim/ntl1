package com.example.pcworld.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);
        ListView listView = (ListView) findViewById(R.id.listview);
        DetailsSong detailsSong0=new DetailsSong("Set bird free", "sia");
        DetailsSong detailsSong1=new DetailsSong("Sky Fall", "Adele");
        DetailsSong detailsSong2=new DetailsSong("What a wonderful world", "Arm.");
        DetailsSong detailsSong3=new DetailsSong("ALive", "Sia");
        DetailsSong detailsSong4=new DetailsSong("Day Dream", "Adele");
        DetailsSong detailsSong5=new DetailsSong("Good Morning", "WW");
        DetailsSong detailsSong6=new DetailsSong("Angle", "Adele");
        DetailsSong detailsSong7=new DetailsSong("one Million", "Sia");
        DetailsSong detailsSong8=new DetailsSong("Fly", "Dian");
        DetailsSong detailsSong9=new DetailsSong("I love you First", "Rihanna");
        ArrayList<DetailsSong> arraylist = new ArrayList<DetailsSong>();
        arraylist.add(detailsSong0);
        arraylist.add(detailsSong1);
        arraylist.add(detailsSong2);
        arraylist.add(detailsSong3);
        arraylist.add(detailsSong4);
        arraylist.add(detailsSong5);
        arraylist.add(detailsSong6);
        arraylist.add(detailsSong7);
        arraylist.add(detailsSong8);
        arraylist.add(detailsSong9);
        SongAdapter Adapter = new SongAdapter(this, arraylist);
        listView.setAdapter(Adapter);
    }
}
