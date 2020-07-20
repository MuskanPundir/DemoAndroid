package com.example.demo.repository

import com.example.demo.model.ChatModel

class ChatRepo {

    fun prepareData(): List<ChatModel> {

        val chatList: MutableList<ChatModel> = mutableListOf()

        for(i in 0..20) {
            val chatModel = ChatModel(
                name = "Muskan",
                msg = "Hello",
                time = "12:01 am"
            )
            chatList.add(chatModel)
        }

        return chatList
    }
}