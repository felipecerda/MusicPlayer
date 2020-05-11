package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Creates the ArrayList to store Songs
        ArrayList<Song> podcasts = new ArrayList<Song>();

        //Add songs
        podcasts.add(new Song("APG 423 - Down the Hatch", "Airline Pilot Guy"));
        podcasts.add(new Song("Episode 84: Completing the trifecta", "AvTalk - Aviation Podcast"));

        SongAdapter adapter = new SongAdapter(this, podcasts);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
