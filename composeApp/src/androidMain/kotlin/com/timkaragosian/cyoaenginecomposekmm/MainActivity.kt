@file:OptIn(ExperimentalDecomposeApi::class)

package com.timkaragosian.cyoaenginecomposekmm

import App
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.retainedComponent
import data.db_source.DatabaseDriverFactory
import ui.navigation.RootComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mMediaPlayer = MediaPlayer.create(this, R.raw.ccommerce_game_audio_mvp)
        mMediaPlayer.setOnPreparedListener {
                mp -> mp.isLooping = true
        }

        val dbDriverFactory = DatabaseDriverFactory(this)

        val root = retainedComponent{
            RootComponent(it, dbDriverFactory)
        }

        setContent {
            mMediaPlayer.start()
            App(root)
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
}