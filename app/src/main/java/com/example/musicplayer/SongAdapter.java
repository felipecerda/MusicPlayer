package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private int mColorResourceId;

    public SongAdapter(Activity context, ArrayList<Song> songs, int colorResourceId){
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtistName());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.title_view);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
