package com.example.a4photo1word

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.a4photo1word.databinding.ActivityGameOneBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class GameThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameOneBinding
    private val CORRECT_WORD = "МАШИНА"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initImage()
        initListener()
        initBtnClear()
        initClearLetter()
        initBtnCheck()
    }

    private fun initBtnCheck() {
        binding.btnCheck.setOnClickListener {
            if (binding.etLetter.text.toString() == CORRECT_WORD) {
                alertDialog()
            } else if (binding.etLetter.text.toString().isEmpty()) {
                Toast.makeText(this, "Поле пустое", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                binding.etLetter.setText("")
                binding.letter1.visibility = View.VISIBLE
                binding.letter2.visibility = View.VISIBLE
                binding.letter3.visibility = View.VISIBLE
                binding.letter4.visibility = View.VISIBLE
                binding.letter5.visibility = View.VISIBLE
                binding.letter6.visibility = View.VISIBLE
                binding.letter7.visibility = View.VISIBLE
                binding.letter8.visibility = View.VISIBLE
                binding.letter9.visibility = View.VISIBLE
                binding.letter10.visibility = View.VISIBLE
                binding.letter11.visibility = View.VISIBLE
                binding.letter12.visibility = View.VISIBLE
            }
        }
    }

    private fun alertDialog() {
        val alertDialog = MaterialAlertDialogBuilder(this)
        alertDialog.setTitle("Вы угадали слово !")
        alertDialog.setMessage("Переходим на следующий экран ?")
        alertDialog.setPositiveButton("Дальше!") { _, _ ->
            val intent = Intent(this, GameThirdActivity::class.java)
            startActivity(intent)
            finish()
        }
        alertDialog.setNegativeButton("В главное меню !") { _, _ ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        alertDialog.show()
    }

    private fun initClearLetter() {
        binding.btnClear.setOnClickListener {
            val text = binding.etLetter.text.toString()
            binding.etLetter.setText(text.substring(0, text.length - 1))
            val letter = text[text.length - 1]
            if (letter.toString() == binding.letter1.text.toString()) {
                binding.letter1.visibility = View.VISIBLE
            }

            if (letter.toString() == binding.letter2.text.toString()) {
                binding.letter2.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter3.text.toString()) {
                binding.letter3.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter4.text.toString()) {
                binding.letter4.visibility = View.VISIBLE
            }

            if (letter.toString() == binding.letter5.text.toString()) {
                binding.letter5.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter6.text.toString()) {
                binding.letter6.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter7.text.toString()) {
                binding.letter7.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter8.text.toString()) {
                binding.letter8.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter9.text.toString()) {
                binding.letter9.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter10.text.toString()) {
                binding.letter10.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter11.text.toString()) {
                binding.letter11.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter12.text.toString()) {
                binding.letter12.visibility = View.VISIBLE
            }
        }
    }

    private fun initBtnClear() {
        binding.etLetter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

            }

            override fun afterTextChanged(editable: Editable) {
                if (editable.length > 0) {
                    binding.btnClear.visibility = View.VISIBLE
                } else {
                    binding.btnClear.visibility = View.GONE
                }
            }
        })
    }

    private fun initListener() {
        binding.letter1.setOnClickListener {
            binding.etLetter.append(binding.letter1.text.toString())
            binding.letter1.visibility = View.INVISIBLE
        }
        binding.letter2.setOnClickListener {
            binding.etLetter.append(binding.letter2.text.toString())
            binding.letter2.visibility = View.INVISIBLE
        }
        binding.letter3.setOnClickListener {
            binding.etLetter.append(binding.letter3.text.toString())
            binding.letter3.visibility = View.INVISIBLE
        }
        binding.letter4.setOnClickListener {
            binding.etLetter.append(binding.letter4.text.toString())
            binding.letter4.visibility = View.INVISIBLE
        }
        binding.letter5.setOnClickListener {
            binding.etLetter.append(binding.letter5.text.toString())
            binding.letter5.visibility = View.INVISIBLE
        }
        binding.letter6.setOnClickListener {
            binding.etLetter.append(binding.letter6.text.toString())
            binding.letter6.visibility = View.INVISIBLE
        }
        binding.letter7.setOnClickListener {
            binding.etLetter.append(binding.letter7.text.toString())
            binding.letter7.visibility = View.INVISIBLE
        }
        binding.letter8.setOnClickListener {
            binding.etLetter.append(binding.letter8.text.toString())
            binding.letter8.visibility = View.INVISIBLE
        }
        binding.letter9.setOnClickListener {
            binding.etLetter.append(binding.letter9.text.toString())
            binding.letter9.visibility = View.INVISIBLE
        }
        binding.letter10.setOnClickListener {
            binding.etLetter.append(binding.letter10.text.toString())
            binding.letter10.visibility = View.INVISIBLE
        }
        binding.letter11.setOnClickListener {
            binding.etLetter.append(binding.letter11.text.toString())
            binding.letter11.visibility = View.INVISIBLE
        }
        binding.letter12.setOnClickListener {
            binding.etLetter.append(binding.letter12.text.toString())
            binding.letter12.visibility = View.INVISIBLE
        }
    }

    private fun initImage() {
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageOne)
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/a/a5/Arnold_Schwarzenegger_by_Gage_Skidmore_3.jpg").centerCrop().into(binding.imageTwo)
        Glide.with(this).load("https://media.ed.edmunds-media.com/dodge/challenger/2022/oem/2022_dodge_challenger_coupe_gt_fq_oem_1_1280.jpg").centerCrop().into(binding.imageThird)
        Glide.with(this).load("https://avatars.mds.yandex.net/get-vertis-journal/4465444/Dodge-Challenger-1-1.jpg_1642323253986/orig").centerCrop().into(binding.imageFour)
    }
}