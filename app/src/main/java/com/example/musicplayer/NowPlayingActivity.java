package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class NowPlayingActivity extends AppCompatActivity {
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

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Main Activity
                Intent songsIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the Podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        // Set a click listener on that View
        podcasts.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Podcasts Activity
                Intent podcastsIntent = new Intent(NowPlayingActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });
    }
}
