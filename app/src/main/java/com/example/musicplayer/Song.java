package com.example.musicplayer;

public class Song {

    private String mSongName;
    private String mArtistName;

    /**
     * Create a new Song object.
     * @param songName is name of the song
     * @param artistName is the artist of the song
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    //Get the song name of the song.
    public String getSongName() {
        return mSongName;
    }


    //Get the artist name of the song.
    public String getArtistName() {
        return mArtistName;
    }

}
