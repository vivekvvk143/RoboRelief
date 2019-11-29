package com.example.vmac.WatBot;

import android.media.AudioManager;
import android.content.Context;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class Stress_buster extends AppCompatActivity {

    ImageButton audio1,audio2,audio3,audio4;
    MediaPlayer play1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_buster);
        audio1 = (ImageButton)findViewById(R.id.imageButton3);
        audio2 = (ImageButton)findViewById(R.id.imageButton2);
        audio3 = (ImageButton)findViewById(R.id.imageButton4);
        audio4 = (ImageButton)findViewById(R.id.imageButton5);

        audio2.setOnClickListener(v -> {

            //play1.setAudioStreamType(AudioManager.STREAM_MUSIC);
            String url = "https://drive.google.com/open?id=1VmcjIpL3z8MNjpv8cRYIU2rXbobLXtuq";
            try{
                if (play1!=null)
                {
                    play1.release();
                }
                play1 = new MediaPlayer();
                play1.setDataSource(url);
                play1.prepareAsync();
                play1.start();
              Toast.makeText(getApplicationContext(), "Playback started",Toast.LENGTH_SHORT);
                //playback_started.show();
                //audio1.setEnabled(false);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        });

    }
}
