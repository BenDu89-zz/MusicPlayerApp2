/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import static com.example.android.musicplayerapp.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(activity_main);

        TextView favoriteSong = (TextView) findViewById(R.id.favoriteSong);
        /*creator for the ClickListener */
        favoriteSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteSongIntent = new Intent(MainActivity.this, FavoriteSongs.class);
                startActivity(favoriteSongIntent);
            }
        });
        TextView songText = (TextView) findViewById(R.id.songText);
        /*creator for the ClickListener */
        songText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songTextIntent = new Intent(MainActivity.this, SongText.class);
                startActivity(songTextIntent);
            }
        });
        TextView donateForTheArtist = (TextView) findViewById(R.id.donateForTheArtist);
        /*creator for the ClickListener */
        donateForTheArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent donateForTheArtistIntent = new Intent(MainActivity.this, DonateForTheArtist.class);
                startActivity(donateForTheArtistIntent);
            }
        });

        TextView upcomingConcert = (TextView) findViewById(R.id.upcomingConcerts);
        /*creator for the ClickListener */
        upcomingConcert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upcomingConcertIntent = new Intent(MainActivity.this, UpcomingConcerts.class);
                startActivity(upcomingConcertIntent);
            }
        });
    }
}
