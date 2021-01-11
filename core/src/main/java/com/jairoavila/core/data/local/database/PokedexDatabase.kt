package com.jairoavila.core.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jairoavila.core.data.local.database.entity.Movie

@Database(entities = [Movie::class], version = 1)
abstract class PokedexDatabase: RoomDatabase() {

}