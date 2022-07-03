package com.krunal.feeds4u.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.krunal.feeds4u.ui.navigation.direction.BottomBarDirection
import com.krunal.feeds4u.ui.navigation.graph.bottomBarNavGraph

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarDirection.Root.route
    ) {

        bottomBarNavGraph(navController = navController)
    }
}
