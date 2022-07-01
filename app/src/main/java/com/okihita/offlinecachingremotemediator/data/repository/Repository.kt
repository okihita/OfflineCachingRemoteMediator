package com.okihita.offlinecachingremotemediator.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.okihita.offlinecachingremotemediator.data.local.dao.UnsplashDatabase
import com.okihita.offlinecachingremotemediator.data.paging.UnsplashRemoteMediator
import com.okihita.offlinecachingremotemediator.data.remote.UnsplashApi
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {

    fun getAllImages() = Pager(
        config = PagingConfig(pageSize = 10),
        remoteMediator = UnsplashRemoteMediator(
            unsplashApi = unsplashApi,
            unsplashDatabase = unsplashDatabase
        ),
        pagingSourceFactory = {
            unsplashDatabase.unsplashImageDao().getAllImages()
        }
    ).flow

    // TODO: Search images
}