package com.example.musicplayer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        TextView titleView = (TextView) findViewById(R.id.np_song_text_view);

        //Gets the name of the song selected that from the previous intent
        String item_name = getIntent().getStringExtra("title_name");

        //Displays the song that is currently playing
        titleView.setText(item_name);

        TextView artistView = (TextView) findViewById(R.id.np_artist_text_view);

        //Gets the artist of the song selected that from the previous intent
        String artist_name = getIntent().getStringExtra("artist_name");

        //Displays the artist that is currently playing
        artistView.setText(artist_name);
    }
}
