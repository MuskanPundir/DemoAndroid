package com.example.demo.ui

import android.os.Bundle
import com.example.demo.databinding.ActivityChatBinding
import com.example.demo.repository.ChatRepo
import com.example.demo.ui.adapter.ChatAdapter

class ChatActivity : BaseActivity() {
    private lateinit var binding: ActivityChatBinding
    private lateinit var chatAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        chatAdapter = ChatAdapter(ChatRepo().prepareData())
        binding.recyclerViewChat.adapter = chatAdapter
    }
}