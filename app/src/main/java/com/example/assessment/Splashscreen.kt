package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val backgroundImg : ImageView = findViewById(R.id.iv_logo)
        val backgroundImg2 : TextView = findViewById(R.id.crystal)

        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        backgroundImg.startAnimation(sideAnimation)
        backgroundImg2.startAnimation(sideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java ))
            finish()
        }, 3000)


    }
}