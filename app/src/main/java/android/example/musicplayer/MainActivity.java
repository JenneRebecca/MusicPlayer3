package android.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView albums;
    ImageView songs;
    ImageView playlists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Category pictures
        albums = findViewById(R.id.albums);
        songs = findViewById(R.id.songs);
        playlists = findViewById(R.id.playlists);

        // Set a click listener on Category pictures
        // The code in this method will be executed when the albums icon is clicked on.
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Albums.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the songs icon is clicked on.
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Songs.class);
                startActivity(intent);
                finish();
            }
        });
        // The code in this method will be executed when the playlists icon is clicked on.
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Playlists.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
