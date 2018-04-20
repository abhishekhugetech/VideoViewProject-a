package com.abhishek.learningandroidstudio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    public void vis(View view){

        // Selecting the video view
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        // Setting the Visiblity to VISIBLE
        videoView.setVisibility(View.VISIBLE);

        // Getting the Video from the Raw Folder in Resources folder
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vide );
        // Creating the new Media Controller
        MediaController mediaController = new MediaController(this);
        // Setting the Anchor to VideoView
        mediaController.setAnchorView(videoView);
        // Adding the Media Controller to the Video View
        videoView.setMediaController(mediaController);
        // At Last Starting the Video
        videoView.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
