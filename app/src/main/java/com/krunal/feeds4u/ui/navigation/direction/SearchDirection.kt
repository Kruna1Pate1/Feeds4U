package com.krunal.feeds4u.ui.navigation.direction

import androidx.navigation.NamedNavArgument

sealed interface SearchDirection : NavigationCommand {

    object Root : NavigationCommand {

        override val name: String
            get() = "Search"

        override val route: String
            get() = "search_route"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }
}