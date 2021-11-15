package com.example.demodesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MusicPlayingActivity extends AppCompatActivity {
    private TextView textView14;
    private ImageView imbBack;
    private RecyclerView rcvSingerPlaylist;
    private TextView textView15;
    private SeekBar playingBar;
    private ImageView imbPlay;
    private ImageView imbPrevious;
    private ImageView imbNext;
    private TextView tvMinutePerSong;
    private ImageView imbFavorite;
    private ImageView imbLoop;
    private ImageView imbPause;
    private CircleImageView cmvSongTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playing);

        textView14 = (TextView) findViewById(R.id.textView14);
        imbBack = (ImageView) findViewById(R.id.imbBack);
        rcvSingerPlaylist = (RecyclerView) findViewById(R.id.rcvSingerPlaylist);
        textView15 = (TextView) findViewById(R.id.textView15);
        playingBar = (SeekBar) findViewById(R.id.playingBar);
        imbPlay = (ImageView) findViewById(R.id.imbPlay);
        imbPrevious = (ImageView) findViewById(R.id.imbPrevious);
        imbNext = (ImageView) findViewById(R.id.imbNext);
        tvMinutePerSong = (TextView) findViewById(R.id.tvMinutePerSong);
        imbFavorite = (ImageView) findViewById(R.id.imbFavorite);
        imbLoop = (ImageView) findViewById(R.id.imbLoop);
        imbPause = (ImageView) findViewById(R.id.imbPause);
        cmvSongTitle = (CircleImageView) findViewById(R.id.cmvSongTitle);


        imbPause.setVisibility(View.GONE);
        imbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });
        imbPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRotateAnimation();
                imbPause.setVisibility(View.VISIBLE);
                imbPlay.setVisibility(View.GONE);
            }
        });
        imbPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopRotateAnimation();
                imbPlay.setVisibility(View.VISIBLE);
                imbPause.setVisibility(View.GONE);
            }
        });
    }
    public void startRotateAnimation(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cmvSongTitle.animate().rotationBy(360).withEndAction(this).setDuration(20000)
                        .setInterpolator(new LinearInterpolator()).start();
            }
        };
        cmvSongTitle.animate().rotationBy(360).withEndAction(runnable).setDuration(20000)
                .setInterpolator(new LinearInterpolator()).start();
    }
    public void stopRotateAnimation(){
        cmvSongTitle.animate().cancel();
    }
}