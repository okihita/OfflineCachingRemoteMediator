package com.okihita.offlinecachingremotemediator.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.okihita.offlinecachingremotemediator.model.UnsplashImage
import com.okihita.offlinecachingremotemediator.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}