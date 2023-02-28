package com.example.newsapp_jetpackcompose.mapper

import com.example.newsapp_jetpackcompose.data.model.ArticleDTO
import com.example.newsapp_jetpackcompose.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
    return map {
        Article(
            title = it.title?:"",
            author = it.author?:"",
            url = it.url?:""
        )
    }
}