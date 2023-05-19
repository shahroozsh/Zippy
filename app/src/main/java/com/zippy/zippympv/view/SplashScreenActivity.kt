package com.zippy.zippympv.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.SplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint


@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding: SplashScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)




        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashScreenActivity, SliderActivity::class.java))
            finish()
        }, 2000)

    }

}