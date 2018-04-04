package com.rajewska.misimusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter <com.rajewska.misimusicapp.Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, songs);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list

        com.rajewska.misimusicapp.Song  currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name_list

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name_list);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID band_name_list
        TextView bandTextView = (TextView) listItemView.findViewById(R.id.band_name_list);

        // Get the version number from the current Song object and
        // set this text on the number TextView

        bandTextView.setText(currentSong.getBandName());

        // Find the ImageView in the list_item.xml layout with the ID

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.cover_list);

        // Get the image resource ID from the current Song object and
        if (currentSong.hasImage()) {
            // set the image to iconView
            imageView.setImageResource(currentSong.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;

    }
}

