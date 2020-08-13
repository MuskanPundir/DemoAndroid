package com.example.demo

import MovieDetail
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demo.repository.MovieRepo

class MovieViewModel : ViewModel() {

    private lateinit var _movieDetails : MutableLiveData<ViewStatus>
    private var movieRepo: MovieRepo = MovieRepo()

    val movieDetail: LiveData<ViewStatus>
    get() = _movieDetails

    init {
       getMovieData()
    }

    private fun getMovieData() {
        _movieDetails = movieRepo.getPopularMovies()
    }

    override fun onCleared() {
        if (!movieRepo.compositeDisposable.isDisposed) {
            movieRepo.compositeDisposable.dispose()
        }
        super.onCleared()
    }

}