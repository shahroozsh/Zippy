package com.zippy.zippympv.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.zippy.zippympv.databinding.ActivityQuestion1LoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuestionLogin1Activity : AppCompatActivity() {


    private lateinit var binding:ActivityQuestion1LoginBinding

    private var mSpinnerInitialized = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion1LoginBinding.inflate(layoutInflater)
        binding.listener = this
        setContentView(binding.root)
        mSpinnerInitialized = false



        binding.spinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    if (mSpinnerInitialized) {
                        startActivity(Intent(this@QuestionLogin1Activity , QuestionLogin3Activity::class.java))
                    } else {
                        mSpinnerInitialized = true
                    }

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }

    }

    /* onClick Close */
    fun onClickClose(view: View){
        finish()

    }

}