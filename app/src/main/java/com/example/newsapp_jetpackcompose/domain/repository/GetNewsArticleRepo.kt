package com.example.newsapp_jetpackcompose.domain.repository

import com.example.newsapp_jetpackcompose.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle():List<Article>
}