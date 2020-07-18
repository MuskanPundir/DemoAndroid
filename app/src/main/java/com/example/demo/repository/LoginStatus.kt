package com.example.demo.repository

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginStatus(
    val email: String,
    val password: String,
    val error: String = "",
    val success: Boolean = false
): Parcelable