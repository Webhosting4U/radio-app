package com.example.gxm.webapp;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.io.IOException;
// * Created by GxM on 10/11/2015.

public class liveActivity extends Activity {

    Button buttonPlayStop;
    TextView text;
    private boolean boolMusicPlaying=false;
    MediaPlayer player;
    RadioButton player1;
    RadioButton player2;
    String ipAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_activity);
        //play();
        initViews();

                if(player1.isSelected())
                {
                    ipAddress="http://85.25.106.137:8006";
                    initializeMediaPlayer();
                    setListeners();

                }

            else

                if( player2.isSelected())
                {
                    ipAddress="http://85.25.106.137:8097";
                    initializeMediaPlayer();
                    setListeners();


                }

    }


    private void initViews(){

        buttonPlayStop=(Button) findViewById(R.id.playStopButton);
        buttonPlayStop.setBackgroundResource(R.drawable.playbutton);
        player1=(RadioButton)findViewById(R.id.radioPlayer1);
        player2=(RadioButton)findViewById(R.id.radioPlayer2);

        player1.setSelected(true);//deafault player is player 1


        //text= (TextView) findViewById(R.id.buffText);

    }


    private void setListeners()
    {
        buttonPlayStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPlayStopClick();

            }
        });

    }//setListeners


    private void buttonPlayStopClick()
    {
        if (!boolMusicPlaying)
        {
            buttonPlayStop.setBackgroundResource(R.drawable.pausebuttonsm);
            playMusic();
            boolMusicPlaying=true;
        }

        else if(boolMusicPlaying)
        {
            buttonPlayStop.setBackgroundResource(R.drawable.playbutton);
            stopPlayingMusic();
            boolMusicPlaying=false;
        }
    }

    public void playMusic()
    {
        //String url = "http://85.25.106.137:8097"; // your URL here
       // MediaPlayer mediaPlayer = new MediaPlayer();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            //mediaPlayer.setDataSource(url);
            player.prepare(); // might take long! (for buffering, etc)
            player.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stopPlayingMusic() {
        if (player.isPlaying()) {
            player.release();
            initializeMediaPlayer();
        }
    }



    private void initializeMediaPlayer() {
        player = new MediaPlayer();
        try {
            player.setDataSource("ipAddress");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player.isPlaying()) {
            player.stop();
        }
    }


    public void play(){
        String url = "http://85.25.106.137:8097"; // your URL here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//class


