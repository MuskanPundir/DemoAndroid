package com.example.demo.repository

import com.example.demo.model.LoginStatus

class Login {

    fun loginUser(loginStatus: LoginStatus): LoginStatus {

        return if (loginStatus.email == "m" && loginStatus.password == "12") {
            LoginStatus(
                email = loginStatus.email,
                password = loginStatus.password,
                success = true
            )
        } else {
            LoginStatus(
                email = loginStatus.email,
                password = loginStatus.password,
                success = false,
                error = "Username or password is not correct"
            )
        }
    }

}

