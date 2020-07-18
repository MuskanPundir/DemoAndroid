package com.example.demo.utils

import android.content.Context
import android.widget.Toast

object Logger {
    private const val TAG = "debugDemo"

    fun showDebugMsg(msg: String) { 
        println("${TAG}: $msg")
    }

    fun showToast(context : Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}