package com.rajewska.misimusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //        ArrayList of playlists

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("", "New Wave & Industrial", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Teenage Goth", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "PJ Harvey Discography", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Sad Songs", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "All Black Everything", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Dark (s)hits", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Eighties", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Dance Or Die", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Super Emo", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Mute", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Batcave", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("", "Into The Darkness", R.drawable.playlist3_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}