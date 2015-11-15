package com.example.gxm.webapp;

import android.app.Service;
import android.content.Intent;
import android.drm.DrmErrorEvent;
import android.drm.DrmManagerClient;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by GxM on 10/21/2015.
 */
public class myPlayService extends Service implements MediaPlayer.OnCompletionListener,MediaPlayer.OnPreparedListener,DrmManagerClient.OnErrorListener,MediaPlayer.OnSeekCompleteListener,MediaPlayer.OnInfoListener,MediaPlayer.OnBufferingUpdateListener {



    private MediaPlayer mediaPlayer = new MediaPlayer();







    @Override
    public void onCreate()
    {
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnBufferingUpdateListener(this);
        mediaPlayer.setOnInfoListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.reset();





    }



    @Override
    public void onBufferingUpdate(MediaPlayer mp, int percent) {

    }

    @Override
    public void onCompletion(MediaPlayer mp) {

    }

    @Override
    public void onError(DrmManagerClient client, DrmErrorEvent event) {

    }

    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        return false;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {

    }

    @Override
    public void onSeekComplete(MediaPlayer mp) {

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
