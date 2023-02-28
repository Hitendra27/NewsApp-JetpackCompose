package com.example.newsapp_jetpackcompose.presentation

import com.example.newsapp_jetpackcompose.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean=false,
    val data:List<Article>?=null,
    val error:String=""
)
