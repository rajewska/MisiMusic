package com.rajewska.misimusicapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // my_child_toolbar is defined in the layout file
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);

        //        ArrayList of artists

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("", "The Creatures", R.mipmap.thecreatures_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Ministry", R.mipmap.ministry_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Nine Inch Nails", R.mipmap.nin_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Throbbing Gristle", R.mipmap.tg_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Death In June", R.mipmap.deathinjune_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "New Order", R.mipmap.neworder_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Talking Heads", R.mipmap.talkingheads_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "PJ Harvey", R.mipmap.pjharvey_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
