package com.rajewska.misimusicapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // my_child_toolbar is defined in the layout file
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);

        //        ArrayList of albums

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("Miss The Girl", "The Creatures", R.mipmap.missthegirl_small));
        songs.add(new com.rajewska.misimusicapp.Song("With Sympathy", "Ministry", R.mipmap.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Further Down The Spiral", "Nine Inch Nails", R.mipmap.furtherdown_small));
        songs.add(new com.rajewska.misimusicapp.Song("20 Jazz Funk Greats", "Throbbing Gristle", R.mipmap.jazzfunk_small));
        songs.add(new com.rajewska.misimusicapp.Song("Nada!", "Death In June", R.mipmap.nada_small));
        songs.add(new com.rajewska.misimusicapp.Song("Power, Corruption & Lies", "New Order", R.mipmap.powercorruption_small));
        songs.add(new com.rajewska.misimusicapp.Song("Remain In Light", "Talking Heads", R.mipmap.remaininlight_small));
        songs.add(new com.rajewska.misimusicapp.Song("To Bring You My Love", "PJ Harvey", R.mipmap.tobringyoumylove_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
