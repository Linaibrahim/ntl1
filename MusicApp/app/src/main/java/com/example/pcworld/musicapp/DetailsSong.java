package com.example.pcworld.musicapp;

public class DetailsSong {
    private String songName;
    private String artistName;

    public DetailsSong(String sName, String aName) {
        songName = sName;
        artistName = aName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }
}
