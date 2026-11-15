package com.example.spotifyclone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    Button btnPlay;
    MediaPlayer mediaPlayer;
    boolean tocando = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        btnPlay = findViewById(R.id.btnPlay);

        mediaPlayer = MediaPlayer.create(this, R.raw.musica);

        btnPlay.setOnClickListener(v -> {

            if (!tocando) {
                mediaPlayer.start();
                btnPlay.setText("Pause");
                tocando = true;
            } else {
                mediaPlayer.pause();
                btnPlay.setText("Play");
                tocando = false;
            }

        });
    }
}