package com.example.demo

import android.os.Bundle
import com.example.demo.databinding.ActivityStartBinding

class StartActivity : BaseActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}