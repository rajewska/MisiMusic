package com.rajewska.misimusicapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // my_child_toolbar is defined in the layout file
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);

        //        ArrayList of playlists

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("", "New Wave & Industrial", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Teenage Goth", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "PJ Harvey Discography", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Sad Songs", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "All Black Everything", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Dark (s)hits", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Eighties", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Dance Or Die", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Super Emo", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Mute", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Batcave", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Into The Darkness", R.mipmap.playlist3_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}