package com.zippy.zippympv.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.zippy.zippympv.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)




    }


    /* onClick login */
    fun onClickLogin(view: View){
        startActivity(Intent(this@RegisterActivity , LoginActivity::class.java))

    }
    /* onClick Need */
    fun onClickNeed(view: View){
        startActivity(Intent(this@RegisterActivity , QuestionLogin1Activity::class.java))
    }
    /* onClick Close */
    fun onClickClose(view: View){
        finish()

    }

}