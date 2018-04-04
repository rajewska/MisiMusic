package com.rajewska.misimusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //        ArrayList of songs

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("Miss The Girl", "The Creatures", R.drawable.missthegirl_small));
        songs.add(new com.rajewska.misimusicapp.Song("Hot Springs In The Snow", "The Creatures", R.drawable.missthegirl_small));
        songs.add(new com.rajewska.misimusicapp.Song("Effigy", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Revenge", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("I Wanted To Tell Her", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Work For Love", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Here We Go", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("What He Say", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Say You're Sorry", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Should Have Known Better", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("She's Got A Cause", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("To Bring You My Love", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Meet Ze Monsta", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Working For The Man", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("C'Mon Billy", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Teclo", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Long Snake Moan", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Down By The Water", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("I Think I'm A Mother", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("Send His Love To Me", "PJ Harvey", R.drawable.tobringyoumylove_small));
        songs.add(new com.rajewska.misimusicapp.Song("The Dancer", "PJ Harvey", R.drawable.tobringyoumylove_small));



        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
