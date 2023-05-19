package com.zippy.zippympv.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)



    }

    /* onClick Login */
    fun onClickLogin(view: View){
//        startActivity(Intent(this@LoginActivity , QuestionLogin1Activity::class.java))

    }

    /* onClick Register */
    fun onClickRegister(view: View){
        startActivity(Intent(this@LoginActivity , SingUpActivity::class.java))

    }

    /* onClick Close */
    fun onClickClose(view: View){
        finish()

    }

}