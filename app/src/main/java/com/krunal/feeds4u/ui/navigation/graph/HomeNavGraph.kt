package com.krunal.feeds4u.ui.navigation.graph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.krunal.feeds4u.ui.home.FeedScreen
import com.krunal.feeds4u.ui.home.FeedViewModel
import com.krunal.feeds4u.ui.navigation.direction.HomeDirection

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {

    navigation(
        route = HomeDirection.Root.route,
        startDestination = HomeDirection.Feed.route
    ) {

        composable(
            route = HomeDirection.Feed.route,
            arguments = HomeDirection.Feed.arguments
        ) {
            val feedViewModel: FeedViewModel = hiltViewModel()
            FeedScreen(viewModel = feedViewModel)
        }

        composable(
            route = HomeDirection.Detail.route,
            arguments = HomeDirection.Detail.arguments
        ) {

            TODO("Implement Details Screen")
        }
    }
}
