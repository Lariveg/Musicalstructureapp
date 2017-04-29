package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the artists category
        CardView album = (CardView) findViewById(R.id.album_card_view);
        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CardView is clicked on.
            @Override
            public void onClick (View view){
                Intent albumIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(albumIntent);
            }
        });

        // Find the back button that goes to MainActivity
       Button btnBack = (Button) findViewById(R.id.btn_back);
        // Set a click listener on that View
        btnBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick (View view){
                Intent btnIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(btnIntent);
            }
        });
    }
}
