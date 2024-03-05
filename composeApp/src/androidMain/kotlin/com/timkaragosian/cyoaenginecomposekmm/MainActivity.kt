package com.timkaragosian.cyoaenginecomposekmm

import App
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mMediaPlayer = MediaPlayer.create(this, R.raw.observingthestar)

        setContent {
            mMediaPlayer.start()
            App()
            //this is a change
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}