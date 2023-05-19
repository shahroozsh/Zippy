package com.zippy.zippympv.view.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.ActivityCreateProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateProfileBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)

    }

    /* onClickBack */
    fun onClickBack(view: View){
        onBackPressed()
    }

    /* onClickBack */
    fun onClickAvatar(view: View){

    }

}