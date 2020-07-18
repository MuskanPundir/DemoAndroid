package com.example.demo

import com.example.demo.repository.Login
import com.example.demo.repository.LoginStatus
import org.junit.Test
import org.junit.Assert.*

class LoginTest {

    @Test
    fun `check user is logging in with credential`() {
        val loginStatus  = LoginStatus(email = "m", password = "12")
        val status = Login().loginUser(loginStatus)
        assertEquals(status.email, loginStatus.email)
        assertEquals(status.password, loginStatus.password)
        assertEquals(status.success, true)
    }

    @Test
    fun `check user is login failed`() {
        val loginStatus  = LoginStatus(email = "m", password = "122")
        val status = Login().loginUser(loginStatus)
        assertEquals(status.email, loginStatus.email)
        assertEquals(status.password, loginStatus.password)
        assertEquals(status.success, false)
        assertEquals(status.error, "Username or password is not correct")
    }
}