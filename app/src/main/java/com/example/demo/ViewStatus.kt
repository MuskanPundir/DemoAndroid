package com.example.demo

import MovieDetail

sealed class ViewStatus {
     data class Success(val data: MovieDetail): ViewStatus()
     data class Failed(val message: String):  ViewStatus()
     object  Loading :  ViewStatus()
 }