package com.krunal.feeds4u.ui

import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.krunal.feeds4u.ui.navigation.NavigationManager
import com.krunal.feeds4u.ui.navigation.graph.SetUpNavGraph
import com.krunal.feeds4u.ui.theme.Feeds4UTheme

@Composable
fun MainScreen(navigationManager: NavigationManager) {

    val appState: MainAppState = rememberMainAppState(navigationManager = navigationManager)

    Feeds4UTheme {

        appState.navigationManager.command.collectAsState().value.also { command ->
            if (command.route.isNotEmpty()) {
                Log.d("MainScreen", "MainScreen: ${command.route}")
                appState.navController.navigate(command.route)
            }
        }

        Scaffold(
            scaffoldState = appState.scaffoldState,
            bottomBar = {
                if (appState.shouldShowBottomBar) {

                }
            },
            topBar = {
                if (appState.shouldShowAppBar) {

                }
            }

        ) {
            SetUpNavGraph(navController = appState.navController)
        }
    }
}