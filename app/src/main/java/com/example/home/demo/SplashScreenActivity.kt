package com.example.home.demo

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.home.demo.ui.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity( Intent(this@SplashScreenActivity, MainActivity::class.java),
                    ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            finish()
        }, 500)
    }
}
