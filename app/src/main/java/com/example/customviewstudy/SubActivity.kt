package com.example.customviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customviewstudy.databinding.ActivityMainBinding
import com.example.customviewstudy.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySubBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.topBar.setupClickListener(
            onClickBackButton = { finish() },
            onClickActionButton1 = {
                Toast.makeText(this@SubActivity, "1111", Toast.LENGTH_SHORT).show()
            },
            onClickActionButton2 = {
                Toast.makeText(this@SubActivity, "2222222222", Toast.LENGTH_SHORT).show()
            }
        )
    }
}