package com.example.gxm.webapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    public void facebookButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,facebookActivity.class);
        startActivity(webViewIntent);
    }
    public void contactButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,contactActivity.class);
        startActivity(webViewIntent);
    }
    public void twitterButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,twitterActivity.class);
        startActivity(webViewIntent);
    }
    public void wwwButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,wwwActivity.class);
        startActivity(webViewIntent);
    }
    public void blogButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,blogActivity.class);
        startActivity(webViewIntent);
    }
    public void recentTracksButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,recentTracksActivity.class);
        startActivity(webViewIntent);
    }
    public void liveButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,liveActivity.class);
        startActivity(webViewIntent);
    }
    public void aboutButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,aboutActivity.class);
        startActivity(webViewIntent);
    }
    public void afierosisButton(View v)
    {

        Intent webViewIntent = new Intent(MainActivity.this,afierosisActivity.class);
        startActivity(webViewIntent);
    }


}
