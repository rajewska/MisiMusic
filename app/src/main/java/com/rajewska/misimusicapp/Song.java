package com.rajewska.misimusicapp;

public class Song {

//    Song's name

    private String mSongName;

//    Band's name

    private String mBandName;

//    Album's cover

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

//    Create a new Song object.

    public Song (String songName, String bandName, int imageResourceId) {
        mSongName = songName;
        mBandName = bandName;
        mImageResourceId = imageResourceId;
    }

//  Get the song's name

    public String getSongName() {
        return mSongName;
    }

//    Get the band's name

    public String getBandName() {
        return mBandName;
    }

//    Get album's cover

    public int getImageResourceId() { return  mImageResourceId;}

    public boolean hasImage () {return mImageResourceId != NO_IMAGE_PROVIDED;}
}
