package com.austin.mytv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {

    private Button mButton, mSButton;

    private YouTubePlayerView mPlayer;
    private  YouTubePlayer.OnInitializedListener playerhandler;
    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)   findViewById(R.id.buttonVideo);
        mSButton = (Button)  findViewById(R.id.buttonVideoSecond);
        mPlayer =  (YouTubePlayerView)  findViewById(R.id.viewYouTube);

        playerhandler = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
              /* youTubePlayer.loadVideo("6Z6wDTRcTL8");*/
                List<String> videoList = new ArrayList<>();
                videoList.add("6Z6wDTRcTL8");
                videoList.add("XOLOLrUBRBY");
                youTubePlayer.loadVideos(videoList);



            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        //on click listener for button
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mPlayer.initialize("AIzaSyASG1cV-X23RnORo0knKpSqABRQdi2E-9U", playerhandler);

            }
        });


    }
}
