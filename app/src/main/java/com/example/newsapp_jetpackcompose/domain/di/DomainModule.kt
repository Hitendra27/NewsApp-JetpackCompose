package com.example.newsapp_jetpackcompose.domain.di

import com.example.newsapp_jetpackcompose.data.network.ApiService
import com.example.newsapp_jetpackcompose.data.repository.GetNewsArticleRepoImpl
import com.example.newsapp_jetpackcompose.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}