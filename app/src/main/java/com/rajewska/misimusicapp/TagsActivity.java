package com.rajewska.misimusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tags);

//        ArrayList of tags

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("#newwave", "", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#goth", "", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#femalevocalists", "", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#80s", "", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#industrial", "", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#depression", "", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#postpunk", "", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#deramboss", "", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#british", "", R.drawable.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#alternative", "", R.drawable.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#darkwave", "", R.drawable.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#sad", "", R.drawable.playlist3_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}