package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.databinding.ActivityProfileBinding
import com.example.demo.repository.LoginStatus
import com.example.demo.utils.Logger

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getUserData()
        binding.btnstart.setOnClickListener {
            openStartActivity()
        }

    }


    private fun getUserData() {
        val loginStatus = intent.getParcelableExtra<LoginStatus>("user")
        Logger.showDebugMsg(loginStatus.email)
    }
    private fun openStartActivity() {
        startActivity(
            Intent(this,
            StartActivity::class.java))


    }
}
