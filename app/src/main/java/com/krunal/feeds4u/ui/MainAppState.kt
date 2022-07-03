package com.krunal.feeds4u.ui

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.krunal.feeds4u.ui.navigation.NavigationManager
import com.krunal.feeds4u.ui.navigation.direction.BottomBarDirection
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


//}

@Composable
fun rememberMainAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    navController: NavHostController = rememberNavController(),
    navigationManager: NavigationManager
) = remember {
    MainAppState(
        scaffoldState = scaffoldState,
        navController = navController,
        navigationManager = navigationManager
    )
}


class MainAppState(
    val scaffoldState: ScaffoldState,
    val navController: NavHostController,
    val navigationManager: NavigationManager
) {

    private val bottomBarRoutes = listOf(
        BottomBarDirection.Root.route,
        BottomBarDirection.Home.route,
        BottomBarDirection.Search.route,
        BottomBarDirection.Bookmark.route,
        BottomBarDirection.Account.route,
    )

    // Bottom bar need to show only in some case
    val shouldShowBottomBar: Boolean
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination?.route in bottomBarRoutes

    // App bar need to show only in some case
    val shouldShowAppBar: Boolean
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination?.route in bottomBarRoutes


}