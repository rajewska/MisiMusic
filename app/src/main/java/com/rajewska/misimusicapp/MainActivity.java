package com.rajewska.misimusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Find Songs and set an onClick listener

        RelativeLayout songs = (RelativeLayout) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        //        Find Artists and set an onClick listener

        RelativeLayout artists = (RelativeLayout) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //        Find Albums and set an onClick listener

        RelativeLayout albums = (RelativeLayout) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //        Find Playlists and set an onClick listener

        RelativeLayout playlists = (RelativeLayout) findViewById(R.id.playlists);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        //        Find Tags and set an onClick listener

        RelativeLayout tags = (RelativeLayout) findViewById(R.id.tags);
        tags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tagsIntent = new Intent(MainActivity.this, TagsActivity.class);
                startActivity(tagsIntent);
            }
        });

        //        Find Favorites and set an onClick listener

        RelativeLayout favorites = (RelativeLayout) findViewById(R.id.favorites);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

    }
}
