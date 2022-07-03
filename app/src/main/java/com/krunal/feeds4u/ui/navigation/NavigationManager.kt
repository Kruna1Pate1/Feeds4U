package com.krunal.feeds4u.ui.navigation

import com.krunal.feeds4u.ui.navigation.direction.NavigationCommand
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton


class NavigationManager {

    var command = MutableStateFlow(NavigationCommand.Default)

    fun navigate(
        direction: NavigationCommand
    ) {
        command.value = direction
    }
}