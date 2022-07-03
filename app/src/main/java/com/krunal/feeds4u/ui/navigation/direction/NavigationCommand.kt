package com.krunal.feeds4u.ui.navigation.direction

import androidx.navigation.NamedNavArgument

sealed interface NavigationCommand {
    val name: String
    val route: String
    val arguments: List<NamedNavArgument>


    // Constant keys for accessing argument-value from
    // navBackStack
    companion object {
        const val KEY_POST_ID = "postId"

        val Default: NavigationCommand = NavigationCommand.Root
    }

    object Root : NavigationCommand {
        override val name: String
            get() = "Default"
        override val route: String
            get() = ""
        override val arguments: List<NamedNavArgument>
            get() = emptyList()

    }
}