package com.example.customviewstudy.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.example.customviewstudy.R
import com.example.customviewstudy.databinding.JongseokTopBarBinding

class JongSeokTopBar(
    context: Context,
    attrs: AttributeSet
): LinearLayout(context, attrs) {
    private lateinit var binding: JongseokTopBarBinding

    init {
        binding = JongseokTopBarBinding.inflate(LayoutInflater.from(context), this, true)

        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.JongSeokTopBar)

        try {
            binding.tvTitle.text = typedArray.getString(R.styleable.JongSeokTopBar_title) ?: ""

            if (typedArray.getBoolean(R.styleable.JongSeokTopBar_showBackButton, false)) {
                binding.btnBack.visibility = View.VISIBLE
            } else binding.btnBack.visibility = View.GONE

            if (typedArray.getBoolean(R.styleable.JongSeokTopBar_showActionButton1, false)) {
                binding.btnAction1.visibility = View.VISIBLE
            } else binding.btnAction1.visibility = View.GONE

            if (typedArray.getBoolean(R.styleable.JongSeokTopBar_showActionButton2, false)) {
                binding.btnAction2.visibility = View.VISIBLE
            } else binding.btnAction2.visibility = View.GONE

        } finally {
            typedArray.recycle()
        }

    }

    fun setupClickListener(
        onClickBackButton: () -> Unit = {},
        onClickActionButton1: () -> Unit = {},
        onClickActionButton2: () -> Unit = {},
    ) {
        binding.btnBack.setOnClickListener {
            onClickBackButton()
        }
        binding.btnAction1.setOnClickListener {
            onClickActionButton1()
        }
        binding.btnAction2.setOnClickListener {
            onClickActionButton2()
        }
    }

}