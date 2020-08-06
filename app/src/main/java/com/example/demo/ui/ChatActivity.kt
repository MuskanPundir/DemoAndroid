package com.example.demo.ui

import android.os.Bundle
import com.example.demo.databinding.ActivityChatBinding

class ChatActivity : BaseActivity() {
    private lateinit var binding: ActivityChatBinding
  //  private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
      //  setRecyclerView()
    }

//    private fun setRecyclerView() {
//        movieAdapter = MovieAdapter(MovieRepo().prepareMovieData(), this)
//        binding.recyclerViewChat.adapter = movieAdapter
//    }

}