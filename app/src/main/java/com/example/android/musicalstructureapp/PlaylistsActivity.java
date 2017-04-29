package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the View that shows the artists category
        CardView playlist = (CardView) findViewById(R.id.playlist_card_view);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CardView is clicked on.
            @Override
            public void onClick (View view){
                Intent playlistIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find the back button that goes to MainActivity
        Button btnBack = (Button) findViewById(R.id.btn_back);
        // Set a click listener on that View
        btnBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick (View view){
                Intent btnIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(btnIntent);
            }
        });
    }
}
