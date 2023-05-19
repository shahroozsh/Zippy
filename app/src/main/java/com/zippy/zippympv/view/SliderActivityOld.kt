package com.zippy.zippympv.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.zippy.zippympv.R
import com.zippy.zippympv.view.adapter.SliderAdapter
import com.zippy.zippympv.databinding.ActivitySliderBinding
import com.zippy.zippympv.view.auth.LoginActivity
import com.zippy.zippympv.view.auth.RegisterActivity
import com.zippy.zippympv.widget.dotsIndicator.DotsIndicator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SliderActivityOld : AppCompatActivity() {


    private lateinit var binding: ActivitySliderBinding;


    @Inject
    lateinit var albumAdapter: SliderAdapter;
    var positionNext = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySliderBinding.inflate(layoutInflater)
//        binding.listener = this
        setContentView(binding.root)


        initAlbum()

//        binding?.tSkip.setOnClickListener {
//            startActivity(Intent(this@SliderActivity,NavActivity::class.java));
//            finish()
//        }

    }

    private fun initAlbum() {

        binding.viewpagerAlbum.adapter = albumAdapter

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dotsIndicator)
        dotsIndicator.setViewPager2(binding.viewpagerAlbum)
        binding.viewpagerAlbum.registerOnPageChangeCallback(registerOnPage)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding.viewpagerAlbum.unregisterOnPageChangeCallback(registerOnPage)
    }

    private var registerOnPage =
        object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("sliderNow", position.toString())
                positionNext = position;

                if (position == 0){
//                    binding.btnSignUp.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.pink))
//                    binding.btnLogin.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.pink))
                    binding.constraintContainer.setBackgroundResource(R.drawable.back1)
                }else if(position==1){
//                    binding.btnSignUp.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.green))
//                    binding.btnLogin.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.green))
                    binding.constraintContainer.setBackgroundResource(R.drawable.back2)

                }else if(position==2){
//                    binding.btnSignUp.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.blue))
//                    binding.btnLogin.setBackgroundColor(ContextCompat.getColor(this@SliderActivity,R.color.blue))
                    binding.constraintContainer.setBackgroundResource(R.drawable.back3)

                }
//                if (positionNext == albumAdapter.itemCount-1)
//                    binding?.btn?.text = getString(R.string.start)
//                else
//                    binding?.btn?.text = getString(R.string.next)

            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
        }

    /* onClick Login */
    fun onClickLogin(view:View){
        startActivity(Intent(this@SliderActivityOld,LoginActivity::class.java))

    }

    /* onClick Login */
    fun onClickRegister(view:View){
        startActivity(Intent(this@SliderActivityOld,RegisterActivity::class.java))

    }

}