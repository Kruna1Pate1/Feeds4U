package com.krunal.feeds4u.ui.navigation.direction

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed interface HomeDirection : NavigationCommand {

    object Root : NavigationCommand {

        override val name: String
            get() = "Home"

        override val route: String
            get() = "home_route"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }

    object Feed : HomeDirection {

        override val name: String
            get() = "Feeds"

        override val route: String
            get() = "feed"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }

    object Detail : HomeDirection {

        override val name: String
            get() = "Details"

        override val route: String
            get() = "detail"

        override val arguments: List<NamedNavArgument>
            get() = listOf(
                navArgument(name = NavigationCommand.KEY_POST_ID) {
                    type = NavType.StringType
                }
            )
    }
}
