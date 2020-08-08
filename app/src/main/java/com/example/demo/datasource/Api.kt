package com.example.demo.datasource

import MovieDetail
import com.example.demo.utils.Constants
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("3/discover/movie?api_key=${Constants.API_KEY}")
    fun getPopularMovies(): Single<MovieDetail>
}