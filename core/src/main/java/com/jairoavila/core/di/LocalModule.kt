package com.jairoavila.core.di

import android.app.Application
import androidx.room.Room
import com.jairoavila.core.data.local.PreferenceHelper
import com.jairoavila.core.data.local.database.PokedexDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object LocalModule {

    private const val DATABASE_NAME = "pokedex_db"

    @Singleton
    fun providePreferenceHelper(androidApplication: Application): PreferenceHelper =
        PreferenceHelper(androidApplication)

    @Provides
    fun provideRoom(@ApplicationContext application: Application): PokedexDatabase {
        return Room.databaseBuilder(
            application.applicationContext,
            PokedexDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

}