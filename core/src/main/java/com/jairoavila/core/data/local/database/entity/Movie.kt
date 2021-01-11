package com.jairoavila.core.data.local.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie (
    @PrimaryKey var id: Int,
    var page : Int,
    var title: String,
    var genre: Int,
    var poster: String
)
