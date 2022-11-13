package com.example.geek_hw7_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geek_hw7_m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            calculateBtn.setOnClickListener{
                resultTv.text = Math().add(numfirstET.text.toString(),numsecondET.text.toString())
            }
        }
    }
}