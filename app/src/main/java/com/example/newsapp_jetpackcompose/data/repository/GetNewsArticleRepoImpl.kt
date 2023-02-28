package com.example.newsapp_jetpackcompose.data.repository

import com.example.newsapp_jetpackcompose.data.network.ApiService
import com.example.newsapp_jetpackcompose.domain.model.Article
import com.example.newsapp_jetpackcompose.domain.repository.GetNewsArticleRepo
import com.example.newsapp_jetpackcompose.mapper.toDomain
import com.example.newsapp_jetpackcompose.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService)
    : GetNewsArticleRepo, SafeApiRequest() {

    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!

    }

}