package com.okihita.offlinecachingremotemediator.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.okihita.offlinecachingremotemediator.util.Constants

@Entity(tableName = Constants.UNSPLASH_REMOTE_KEYS)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)
