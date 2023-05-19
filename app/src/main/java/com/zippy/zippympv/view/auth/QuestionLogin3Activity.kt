package com.zippy.zippympv.view.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.ActivityQuestion3LoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuestionLogin3Activity : AppCompatActivity() {


    private lateinit var binding: ActivityQuestion3LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion3LoginBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)

    }

    /* onClick Close */
    fun onClickClose(view: View) {
        finish()

    }
}