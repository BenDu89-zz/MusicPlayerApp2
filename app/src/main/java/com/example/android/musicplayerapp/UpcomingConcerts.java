package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpcomingConcerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_concerts);

        Button toTheStartPage = (Button) findViewById(R.id.buttonBackToStartPage);
        /*creator for the ClickListener */
        toTheStartPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTheStartPageIntent = new Intent(UpcomingConcerts.this,MainActivity.class);
                startActivity(toTheStartPageIntent);
            }
        });
    }
}
