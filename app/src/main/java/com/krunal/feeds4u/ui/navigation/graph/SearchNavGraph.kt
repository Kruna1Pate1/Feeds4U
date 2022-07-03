package com.krunal.feeds4u.ui.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.krunal.feeds4u.ui.navigation.direction.SearchDirection

fun NavGraphBuilder.searchNavGraph(
    navController: NavHostController
) {

    navigation(
        route = SearchDirection.Root.route,
        startDestination = "" // TODO: Initial search screen route
    ) {

    }
}