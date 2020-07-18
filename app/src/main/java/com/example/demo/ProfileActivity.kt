package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.repository.LoginStatus
import com.example.demo.utils.Logger

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        getUserData()
    }


    private fun getUserData() {
        val loginStatus = intent.getParcelableExtra<LoginStatus>("user")
        Logger.showDebugMsg(loginStatus.email)
    }
}
