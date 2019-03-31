package android.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Playlists extends AppCompatActivity {

    ImageView player;
    ImageView albums;
    ImageView songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Category pictures
        player = findViewById(R.id.player);
        albums = findViewById(R.id.albums);
        songs = findViewById(R.id.songs);

        // Set a click listener on Category pictures
        // The code in this method will be executed when the player icon is clicked on.
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Playlists.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the albums icon is clicked on.
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Playlists.this, Albums.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the songs icon is clicked on.
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Playlists.this, Songs.class);
                startActivity(intent);
                finish();
            }
        });

    }
}


