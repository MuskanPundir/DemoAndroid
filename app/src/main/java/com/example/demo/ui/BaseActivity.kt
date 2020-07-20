package com.example.demo.ui

import androidx.appcompat.app.AppCompatActivity
import com.example.demo.utils.Logger

abstract class BaseActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Logger.showDebugMsg("onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.showDebugMsg("onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.showDebugMsg("onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.showDebugMsg("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Logger.showDebugMsg("onRestart")
    }

    override fun onDestroy() {
        Logger.showDebugMsg("onDestroy")
        super.onDestroy()
    }


}