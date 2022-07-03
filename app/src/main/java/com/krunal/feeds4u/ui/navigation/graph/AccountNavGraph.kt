package com.krunal.feeds4u.ui.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.krunal.feeds4u.ui.navigation.direction.AccountDirection

fun NavGraphBuilder.accountNavGraph(
    navController: NavHostController
) {

    navigation(
        route = AccountDirection.Root.route,
        startDestination = "" // TODO: Initial search screen route
    ) {

    }
}