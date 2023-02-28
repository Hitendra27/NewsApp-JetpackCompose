package com.example.newsapp_jetpackcompose.domain.model

import com.example.newsapp_jetpackcompose.data.model.SourceDTO

data class Article(
    val title: String,
    val author: String,
    val url: String
)
