package com.jairoavila.core.di

import com.jairoavila.core.data.remote.PokemonApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    private const val API_URL = "https://api.themoviedb.org/3/"

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Provides
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient().newBuilder().apply {
            addInterceptor(interceptor)
        }.build()
    }

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().apply {
            baseUrl(API_URL)
            client(okHttpClient)
            addConverterFactory(GsonConverterFactory.create())
        }.build()
    }

    @Singleton
    fun providePokemonApi(retrofit: Retrofit): PokemonApi = retrofit.create(PokemonApi::class.java)
}