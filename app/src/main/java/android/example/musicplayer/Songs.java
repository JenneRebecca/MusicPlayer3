package android.example.musicplayer;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    ImageView player;
    ImageView albums;
    ImageView playlists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songlist = new ArrayList<>();

        songlist.add(new Song("Bad Liar", "Imagine Dragons"));
        songlist.add(new Song("Boomerang", "Imagine Dragons"));
        songlist.add(new Song("Natural", "Imagine Dragons"));
        songlist.add(new Song("Machine", "Imagine Dragons"));
        songlist.add(new Song("Whatever It Takes", "Imagine Dragons"));
        songlist.add(new Song("Demons", "Imagine Dragons"));
        songlist.add(new Song("Radioactive", "Imagine Dragons"));
        songlist.add(new Song("Next To Me", "Imagine Dragons"));
        songlist.add(new Song("On Top Of The World", "Imagine Dragons"));
        songlist.add(new Song("I Bet My Life", "Imagine Dragons"));


        SongAdapter adapter = new SongAdapter(this, songlist);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Category pictures
        player = findViewById(R.id.player);
        albums = findViewById(R.id.albums);
        playlists = findViewById(R.id.playlists);

        // Set a click listener on Category pictures
        // The code in this method will be executed when the player icon is clicked on.
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the albums icon is clicked on.
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, Albums.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the playlists icon is clicked on.
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, Playlists.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
