package com.austin.mytv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {


    private final String API_KEY = "AIzaSyASG1cV-X23RnORo0knKpSqABRQdi2E-9U";

     String mapoKezi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        mapoKezi = intent.getStringExtra("channel");

        Toast.makeText(this, mapoKezi, Toast.LENGTH_SHORT).show();


        YouTubePlayerView  mPlayer =  (YouTubePlayerView)  findViewById(R.id.viewYouTube);

        YouTubePlayer.OnInitializedListener playerhandler = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

              youTubePlayer.loadVideo(mapoKezi);



            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

      mPlayer.initialize(API_KEY,playerhandler);

    }
}
