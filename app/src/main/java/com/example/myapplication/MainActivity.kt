package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var num = 0
    private val list = arrayListOf<data>()
    private lateinit var adapter:AdapterCount
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = AdapterCount(list)
        binding.recycle.adapter = adapter


        binding.BtnPlus.setOnClickListener{
            num++
            binding.counterText.text = num.toString()
           list.add(data(num.toString()))
            Log.e("ololo", "onCreate:${list} ", )


        }
        binding.BtnMinus.setOnClickListener{
            num--
            binding.counterText.text = num.toString()

        }
    }
}
