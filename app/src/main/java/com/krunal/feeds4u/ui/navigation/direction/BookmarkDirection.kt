package com.krunal.feeds4u.ui.navigation.direction

import androidx.navigation.NamedNavArgument

sealed interface BookmarkDirection : NavigationCommand {

    object Root : NavigationCommand {

        override val name: String
            get() = "Bookmark"

        override val route: String
            get() = "bookmark_route"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }
}