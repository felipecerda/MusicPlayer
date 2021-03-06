package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

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
        podcasts.add(new Song("Buble Wrap And Prayers", "Rework"));
        podcasts.add(new Song("Saying how you are feeling", "Coffee Break German"));
        podcasts.add(new Song("Living on Hope", "Rework"));
        podcasts.add(new Song("Saying your name", "Coffee Break German"));
        podcasts.add(new Song("APG 412 - Caution: Whale Turbulence", "Airline Pilot Guy"));
        podcasts.add(new Song("Episode 83: Have we hit the bottom?", "AvTalk - Aviation Podcast"));
        podcasts.add(new Song("Breadcamp", "Rework"));
        podcasts.add(new Song("Saying where you are from", "Coffee Break German"));

        SongAdapter adapter = new SongAdapter(this, podcasts, R.color.colorPrimaryDark);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Main Activity
                Intent songsIntent = new Intent(PodcastsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(songsIntent);
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
                Intent playingIntent = new Intent(PodcastsActivity.this, NowPlayingActivity.class);
                playingIntent.putExtra("title_name", selectedTitle);
                playingIntent.putExtra("artist_name", selectedArtist);

                // Start the new activity
                startActivity(playingIntent);
            }
        });

    }

}