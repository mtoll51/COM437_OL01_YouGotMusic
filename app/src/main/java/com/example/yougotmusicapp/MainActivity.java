package com.example.yougotmusicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class MainActivity extends AppCompatActivity
{
    private Button selectSongButton;
    private TextView songTextView;
    private List<String> songs;
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectSongButton = findViewById(R.id.selectSongButton);
        songTextView = findViewById(R.id.songTextView);
        // Initialize the list of songs
        songs = new ArrayList<>();
        songs.add("Song 1");
        songs.add("Song 2");
        songs.add("Song 3");
        songs.add("Song 4");
        songs.add("Song 5");
        selectSongButton.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                // Select a random song from the list
                Random random = new Random();
                int index = random.nextInt(songs.size());
                String selectedSong = songs.get(index);
                // Display the selected song
                songTextView.setText(selectedSong);
            }
        });
    }
}
