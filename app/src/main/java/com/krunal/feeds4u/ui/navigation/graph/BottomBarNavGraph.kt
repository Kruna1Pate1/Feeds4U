package com.krunal.feeds4u.ui.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.krunal.feeds4u.ui.navigation.direction.BottomBarDirection

fun NavGraphBuilder.bottomBarNavGraph(navController: NavHostController) {
    navigation(
        route = BottomBarDirection.Root.route,
        startDestination = BottomBarDirection.Home.route
    ) {

        homeNavGraph(navController = navController)

//        searchNavGraph(navController = navController)
//
//        bookmarkNavGraph(navController = navController)
//
//        accountNavGraph(navController = navController)
    }
}
