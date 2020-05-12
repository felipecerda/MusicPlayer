package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Songs Activity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

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
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });
    }
}
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates the ArrayList to store Songs
        ArrayList<Song> songs = new ArrayList<Song>();

        //Add songs
        songs.add(new Song("Family", "The Interrupters"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));
        songs.add(new Song("Roots Radical", "Rancid"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Find the View that shows the Podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        // Set a click listener on that View
        podcasts.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Podcasts Activity
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });

        // Set a click listener for the NowPlaying title
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item
                String selectedTitle = ((TextView) view.findViewById(R.id.song_text_view)).getText().toString();
                String selectedArtist = ((TextView) view.findViewById(R.id.artist_text_view)).getText().toString();

                //Create the intent to open the Now Playing screen
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                playingIntent.putExtra("title_name", selectedTitle);
                playingIntent.putExtra("artist_name", selectedArtist);

                // Start the new activity
                startActivity(playingIntent);
            }
        });

    }
}

