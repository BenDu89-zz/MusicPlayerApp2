package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FavoriteSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_songs);
        /* ButtonView for the input */
        Button toTheSongtext = (Button) findViewById(R.id.buttonToSongText);
        /*creator for the ClickListener */
        toTheSongtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTheSongtextIntent = new Intent(FavoriteSongs.this,SongText.class);
                startActivity(toTheSongtextIntent);}
        });
    }
}
