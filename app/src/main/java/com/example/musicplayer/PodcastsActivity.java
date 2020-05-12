package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
/*
public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Creates the ArrayList to store podcast titles
        ArrayList<Song> podcasts = new ArrayList<Song>();

        //Add songs
        podcasts.add(new Song("APG 423 - Down the Hatch", "Airline Pilot Guy"));
        podcasts.add(new Song("Episode 84: Completing the trifecta", "AvTalk - Aviation Podcast"));

        SongAdapter adapter = new SongAdapter(this, podcasts);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
*/

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates the ArrayList to store podcast titles
        ArrayList<Song> podcasts = new ArrayList<Song>();

        //Add songs
        podcasts.add(new Song("APG 423 - Down the Hatch", "Airline Pilot Guy"));
        podcasts.add(new Song("Episode 84: Completing the trifecta", "AvTalk - Aviation Podcast"));

        SongAdapter adapter = new SongAdapter(this, podcasts);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Songs Activity
                Intent songsIntent = new Intent(PodcastsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

    }

}