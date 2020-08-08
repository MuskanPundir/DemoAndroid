package com.example.demo.repository

import MovieDetail
import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.demo.datasource.Api
import com.example.demo.datasource.RetrofitService
import com.squareup.picasso.Picasso
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MovieRepo {
    private val retrofit = RetrofitService.getRetrofitInstance()
    private val api = retrofit.create(Api::class.java)
    private val movieData = MutableLiveData<MovieDetail>()

    @SuppressLint("CheckResult")
    fun getPopularMovies(): LiveData<MovieDetail> {
        api.getPopularMovies().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                movieData.postValue(it)
            }, {
                println(it.localizedMessage)
            })

        return movieData
    }
}