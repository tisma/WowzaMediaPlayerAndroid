package com.example.dellboy.wowzamediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity {

    private Button button;
    private MediaPlayer mediaPlayer;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        videoView = (VideoView) findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("rtsp://192.168.0.11:1935/vod/sample.mp4"));
//        mediaPlayer = new MediaPlayer();
//        try {
//            mediaPlayer.setDataSource("rtsp://192.168.0.11:1935/live/myStream");
//            mediaPlayer.prepare();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mediaPlayer.start();
                videoView.start();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
