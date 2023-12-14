package com.example.customviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customviewstudy.databinding.ActivityMainBinding
import com.example.customviewstudy.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySubBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}