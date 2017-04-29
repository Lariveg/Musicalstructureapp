package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Find the View that shows the artists category
        CardView artist = (CardView) findViewById(R.id.artist_card_view);
        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CardView is clicked on.
            @Override
            public void onClick (View view){
                Intent artistIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(artistIntent);
            }
        });

        // Find the back button that goes to MainActivity
        Button btnBack = (Button) findViewById(R.id.btn_back);
        // Set a click listener on that View
        btnBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick (View view){
                Intent btnIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(btnIntent);
            }
        });
    }
}
