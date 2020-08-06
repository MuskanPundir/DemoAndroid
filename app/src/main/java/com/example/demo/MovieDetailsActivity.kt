package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.databinding.ActivityChatBinding
import com.example.demo.databinding.ActivityMovieDetailsBinding
import com.example.demo.ui.BaseActivity
import com.example.demo.utils.CartoonAdapter

class MovieDetailsActivity : BaseActivity() {
    private lateinit var binding :ActivityMovieDetailsBinding
    private lateinit var cartoonAdapter: CartoonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setRecyclerView()
    }
//private fun setRecyclerView() {
//    cartoonAdapter = CartoonAdapter(CartoonRepo().prepareData(),this)
//binding.recyclerViewMovieDetails.adapter = cartoonAdapter
//
//}

    }
