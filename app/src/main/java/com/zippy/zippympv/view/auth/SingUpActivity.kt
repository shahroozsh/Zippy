package com.zippy.zippympv.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.ActivitySignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SingUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)


    }

    /* onClickBack */
    fun onClickBack(view: View){
        onBackPressed()
    }

    /* onClickBack */
    fun onClickCreateAccount(view: View){
        startActivity(Intent(this@SingUpActivity , CreateProfileActivity::class.java))
    }

}