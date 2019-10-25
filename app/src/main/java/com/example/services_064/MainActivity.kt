package com.example.services_064

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("hhtp://www.facebook.com/RendraAdityaPrameswara"))
            startActivity(i)
        })
        button_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("hhtp://www.instagram.com/mr_.insomniac"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.illenium)

        button_play.setOnClickListener{
            MediaPlayer?.start()
        }
        button_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        button_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}

