package com.okihita.offlinecachingremotemediator.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.okihita.offlinecachingremotemediator.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
) {

    @Serializable
    data class Urls(
        val regular: String
    )

    @Serializable
    data class User(
        @SerialName("links")
        @Embedded
        val userLinks: UserLinks,
        val username: String
    ) {
        @Serializable
        class UserLinks(
            val html: String
        )
    }
}