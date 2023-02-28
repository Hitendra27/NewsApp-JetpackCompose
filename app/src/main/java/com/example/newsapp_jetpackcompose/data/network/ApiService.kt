package com.example.newsapp_jetpackcompose.data.network

import com.example.newsapp_jetpackcompose.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // https://newsapi.org/v2/everything?q=tesla&from=2023-01-28&sortBy=publishedAt&apiKey=b76d4fca583649c59625ab452b9ccbc4

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country:String="us",
        @Query("apiKey") apiKey:String="b76d4fca583649c59625ab452b9ccbc4"
    ): Response<NewsDTO>
}