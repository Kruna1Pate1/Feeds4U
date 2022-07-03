package com.krunal.feeds4u.ui.navigation.direction

import androidx.navigation.NamedNavArgument

sealed interface AccountDirection : NavigationCommand {

    object Root : NavigationCommand {

        override val name: String
            get() = "Home"

        override val route: String
            get() = "home_route"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }

}