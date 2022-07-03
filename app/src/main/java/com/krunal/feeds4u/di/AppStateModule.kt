package com.krunal.feeds4u.di

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.krunal.feeds4u.ui.MainAppState
import com.krunal.feeds4u.ui.navigation.NavigationManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Responsible for providing dependency of MainAppState
 * and NavigationManager
 */
@Module
@InstallIn(SingletonComponent::class)
object AppStateModule {


    // Responsible for providing singleton object dependency of
    // Navigation manager
    @Singleton
    @Provides
    fun providesNavigationManager(): NavigationManager = NavigationManager()

    // Responsible for providing singleton object dependency of
    // Scaffold State
//    @Singleton
//    @Provides
//    @Composable
//    fun providesScaffoldState(): ScaffoldState = rememberScaffoldState()

    // Responsible for providing singleton object dependency of
    // Navigation Controller
//    @Singleton
//    @Provides
//    @Composable
//    fun providesNavController(): NavHostController = rememberNavController()

    // Responsible for providing singleton object dependency of
    // Main State of Application
//    @Singleton
//    @Provides
//    @Composable
//    fun providesMainAppState(
//        scaffoldState: ScaffoldState,
//        navController: NavHostController,
//        navigationManager: NavigationManager
//    ): MainAppState = MainAppState(
//        scaffoldState = scaffoldState,
//        navController = navController,
//        navigationManager = navigationManager
//    )

}