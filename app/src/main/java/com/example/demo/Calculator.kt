package com.example.demo

import com.example.demo.utils.Logger
class Calculator {

    fun add(num1: Int, num2: Int): Int {
        val sum = num1 + num2
        Logger.showDebugMsg(msg = "sum is $sum")
        return sum
    }

    fun sub(num1: Int, num2: Int): Int {
        val sub = num1 - num2
        Logger.showDebugMsg(msg = "sum is $sub")
        return sub
    }

    fun mul(num1: Int, num2: Int): Int {
        val mul = num1 * num2
        Logger.showDebugMsg(msg = "sum is $mul")
        return mul
    }

    fun div(num1: Int, num2: Int): Int {
        val div = num1 / num2
        Logger.showDebugMsg(msg = "sum is $div")
        return div
    }

    fun per(num1: Double, num2: Double): Double {
        val per = (num1  / num2) *100
        Logger.showDebugMsg(msg = "sum is $per")
        return per
    }

    fun rem(num1: Int, num2: Int): Int {
        val rem = (num1 % num2)
        Logger.showDebugMsg(msg = "sum is $rem")
        return rem
    }

}

