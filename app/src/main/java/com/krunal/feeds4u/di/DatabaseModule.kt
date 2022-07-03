package com.krunal.feeds4u.di

import android.content.Context
import androidx.room.Room
import com.krunal.feeds4u.db.ArticleDao
import com.krunal.feeds4u.db.ArticleDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesArticleDatabase(
        @ApplicationContext context: Context
    ): ArticleDatabase = Room.databaseBuilder(
        context,
        ArticleDatabase::class.java,
        "article_db.db"
    ).build()

    @Singleton
    @Provides
    fun providesArticleDao(
        articleDatabase: ArticleDatabase
    ): ArticleDao = articleDatabase.getArticleDao()
}