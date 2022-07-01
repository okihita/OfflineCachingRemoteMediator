package com.okihita.offlinecachingremotemediator.data.remote

import com.okihita.offlinecachingremotemediator.BuildConfig
import com.okihita.offlinecachingremotemediator.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Accept-Version: v1", "Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): List<UnsplashImage>

    @Headers("Accept-Version: v1", "Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): List<UnsplashImage>

}