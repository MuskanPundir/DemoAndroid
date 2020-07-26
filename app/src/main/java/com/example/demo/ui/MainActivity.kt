package com.example.demo.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.demo.databinding.ActivityMainBinding
import com.example.demo.repository.Login
import com.example.demo.model.LoginStatus

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            login()
        }
    }


    private fun login() {
        val loginStatus = LoginStatus(
            email = binding.tvUsername.text.toString(),
            password = binding.tvPassword.text.toString()
        )
        val status = Login().loginUser(loginStatus)
        if (status.success) {
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()
            openProfileActivity(status)
        } else {
            Toast.makeText(this, status.error, Toast.LENGTH_SHORT).show()
        }
    }

    private fun openProfileActivity(loginStatus: LoginStatus) {
        startActivity(Intent(this,
            ProfileActivity::class.java).putExtra("user", loginStatus))
    }

}