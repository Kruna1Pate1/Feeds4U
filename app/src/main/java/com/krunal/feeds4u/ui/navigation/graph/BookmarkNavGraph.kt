package com.krunal.feeds4u.ui.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.krunal.feeds4u.ui.navigation.direction.BookmarkDirection

fun NavGraphBuilder.bookmarkNavGraph(
    navController: NavHostController
) {

    navigation(
        route = BookmarkDirection.Root.route,
        startDestination = "" // TODO: Initial search screen route
    ) {

    }
}