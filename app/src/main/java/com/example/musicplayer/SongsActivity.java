package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Creates the ArrayList to store Songs
        ArrayList<Song> songs = new ArrayList<Song>();

        //Add songs
        songs.add(new Song("Family", "The Interrupters"));
        songs.add(new Song("Roots Radical", "Rancid"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
