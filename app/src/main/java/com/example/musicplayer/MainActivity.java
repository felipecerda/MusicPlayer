package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PodcastsActivity
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });
    }
}
