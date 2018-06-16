package com.example.pcworld.musicapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<DetailsSong> {

    public SongAdapter(Context context, ArrayList<DetailsSong> arraylist) {

        super(context, 0, arraylist);
    }

    @Override
    public View getView(int position, View comeView, ViewGroup parent) {
        View view = comeView;
        if (view == null) {
            LayoutInflater layoutInflater = null;
            view = layoutInflater.from(getContext()).inflate(R.layout.item_design, null);
        }
        DetailsSong dataPosition = getItem(position);
        TextView songName = (TextView) view.findViewById(R.id.nameSong);
        TextView artistName = (TextView) view.findViewById(R.id.nameArtist);
        songName.setText(dataPosition.getSongName());
        artistName.setText(dataPosition.getArtistName());
        return view;
    }
}
