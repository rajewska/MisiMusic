package com.rajewska.misimusicapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class TagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tags);

        // my_child_toolbar is defined in the layout file
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);

        //        ArrayList of tags

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("#newwave", "", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#goth", "", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#femalevocalists", "", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#80s", "", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#industrial", "", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#depression", "", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#postpunk", "", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#deramboss", "", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#british", "", R.mipmap.playlist3_small));
        songs.add(new com.rajewska.misimusicapp.Song("#alternative", "", R.mipmap.playlist1_small));
        songs.add(new com.rajewska.misimusicapp.Song("#darkwave", "", R.mipmap.playlist2_small));
        songs.add(new com.rajewska.misimusicapp.Song("#sad", "", R.mipmap.playlist3_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}