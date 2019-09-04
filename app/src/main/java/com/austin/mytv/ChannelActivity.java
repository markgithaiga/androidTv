package com.austin.mytv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChannelActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);
    }

    public void buttonKtn(View view) {

        Intent ktnChannell = new Intent(ChannelActivity.this, MainActivity.class);

        ktnChannell.putExtra("channel", "WdB3EMkmgoM");

        startActivity(ktnChannell);
    }

    public void buttonK24(View view) {

        Intent k24Channel = new Intent(ChannelActivity.this, MainActivity.class);

        k24Channel.putExtra("channel", "AdysK2T4Qe8");

        startActivity(k24Channel);


    }

    public void buttonAljazeera(View view) {
    }

    public void buttonCnn(View view) {
    }
}
