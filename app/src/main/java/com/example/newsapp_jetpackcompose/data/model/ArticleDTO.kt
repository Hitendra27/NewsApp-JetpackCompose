package com.example.newsapp_jetpackcompose.data.model

data class ArticleDTO(
    val author: String,
    val publishedAt: String,
    val source: SourceDTO,
    val title: String,
    val url: String
)