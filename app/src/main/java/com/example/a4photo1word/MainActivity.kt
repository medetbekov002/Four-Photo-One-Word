package com.example.a4photo1word

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.a4photo1word.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initImage()

        binding.btnGame.setOnClickListener {
            initNav()
        }
    }

    private fun initNav() {
        val intent = Intent(this, GameOneActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun initImage() {
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageOne)
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/a/a5/Arnold_Schwarzenegger_by_Gage_Skidmore_3.jpg").centerCrop().into(binding.imageTwo)
        Glide.with(this).load("https://media.ed.edmunds-media.com/dodge/challenger/2022/oem/2022_dodge_challenger_coupe_gt_fq_oem_1_1280.jpg").centerCrop().into(binding.imageThird)
        Glide.with(this).load("https://avatars.mds.yandex.net/get-vertis-journal/4465444/Dodge-Challenger-1-1.jpg_1642323253986/orig").centerCrop().into(binding.imageFour)
    }
}