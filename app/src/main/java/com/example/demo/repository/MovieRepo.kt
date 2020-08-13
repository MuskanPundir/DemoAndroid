package com.example.demo.repository

import MovieDetail
import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.demo.ViewStatus
import com.example.demo.datasource.Api
import com.example.demo.datasource.RetrofitService
import com.squareup.picasso.Picasso
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieRepo {
    private val retrofit = RetrofitService.getRetrofitInstance()
    private val api = retrofit.create(Api::class.java)
    private val movieData = MutableLiveData<ViewStatus>()
    lateinit var compositeDisposable: CompositeDisposable

    fun getPopularMovies(): MutableLiveData<ViewStatus> {
        movieData.postValue(ViewStatus.Loading)
        compositeDisposable = CompositeDisposable()
        compositeDisposable.add(api.getPopularMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                movieData.postValue(ViewStatus.Success(it))
            }, {
                println(it.localizedMessage)
                movieData.postValue(ViewStatus.Failed(it.localizedMessage))

            })
        )
        return movieData
    }
}