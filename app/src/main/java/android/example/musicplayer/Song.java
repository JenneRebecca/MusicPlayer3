package android.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Song represents Song title and Artist
 */
public class Song {

    /** Song Title */
    private String mSongTitle;
    /** Artist name */
    private String mArtist;

    public Song(String songTitle, String artist){
        mSongTitle = songTitle;
        mArtist = artist;
    }
    /**
     *  Get the song title.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /** Get the Artist. */
    public String getArtist() {
        return mArtist;
    }
}