package com.okihita.offlinecachingremotemediator.model

import androidx.room.Embedded
import androidx.room.Entity
import com.okihita.offlinecachingremotemediator.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
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