package com.rajewska.misimusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //        ArrayList of artists

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("", "The Creatures", R.drawable.thecreatures_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Ministry", R.drawable.ministry_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Nine Inch Nails", R.drawable.nin_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Throbbing Gristle", R.drawable.tg_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Death In June", R.drawable.deathinjune_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "New Order", R.drawable.neworder_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Talking Heads", R.drawable.talkingheads_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "PJ Harvey", R.drawable.pjharvey_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
