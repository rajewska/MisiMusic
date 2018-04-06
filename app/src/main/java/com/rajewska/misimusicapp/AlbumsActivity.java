package com.rajewska.misimusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //        ArrayList of albums

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new com.rajewska.misimusicapp.Song("Miss The Girl", "The Creatures", R.drawable.missthegirl_small));
        songs.add(new com.rajewska.misimusicapp.Song("With Sympathy", "Ministry", R.drawable.withsympathy_small));
        songs.add(new com.rajewska.misimusicapp.Song("Further Down The Spiral", "Nine Inch Nails", R.drawable.furtherdown_small));
        songs.add(new com.rajewska.misimusicapp.Song("20 Jazz Funk Greats", "Throbbing Gristle", R.drawable.jazzfunk_small));
        songs.add(new com.rajewska.misimusicapp.Song("Nada!", "Death In June", R.drawable.nada_small));
        songs.add(new com.rajewska.misimusicapp.Song("Power, Corruption & Lies", "New Order", R.drawable.powercorruption_small));
        songs.add(new com.rajewska.misimusicapp.Song("Remain In Light", "Talking Heads", R.drawable.remaininlight_small));
        songs.add(new com.rajewska.misimusicapp.Song("To Bring You My Love", "PJ Harvey", R.drawable.tobringyoumylove_small));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
