package com.krunal.feeds4u.ui.navigation.direction

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NamedNavArgument

sealed interface BottomBarDirection : NavigationCommand {

    val icon: ImageVector

    object Root : NavigationCommand {

        override val name: String
            get() = "Bottom Navgation"

        override val route: String
            get() = "bottom_route"

        override val arguments: List<NamedNavArgument>
            get() = emptyList()
    }

    object Home : BottomBarDirection {

        override val name: String
            get() = HomeDirection.Root.name

        override val route: String
            get() = HomeDirection.Root.route

        override val arguments: List<NamedNavArgument>
            get() = HomeDirection.Root.arguments

        override val icon: ImageVector
            get() = Icons.Default.Home

    }

    object Search : BottomBarDirection {

        override val name: String
            get() = SearchDirection.Root.name

        override val route: String
            get() = SearchDirection.Root.route

        override val arguments: List<NamedNavArgument>
            get() = SearchDirection.Root.arguments

        override val icon: ImageVector
            get() = Icons.Default.Search
    }

    object Bookmark : BottomBarDirection {

        override val name: String
            get() = BookmarkDirection.Root.name

        override val route: String
            get() = BookmarkDirection.Root.route

        override val arguments: List<NamedNavArgument>
            get() = BookmarkDirection.Root.arguments

        override val icon: ImageVector
            get() = TODO("Bookmark icon needed")
    }

    object Account : BottomBarDirection {

        override val name: String
            get() = AccountDirection.Root.name

        override val route: String
            get() = AccountDirection.Root.route

        override val arguments: List<NamedNavArgument>
            get() = AccountDirection.Root.arguments

        override val icon: ImageVector
            get() = Icons.Default.AccountCircle
    }
}
