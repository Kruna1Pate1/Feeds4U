package com.krunal.feeds4u.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Red500,
    primaryVariant = Red900,
    onPrimary = Color.Black,
    secondary = Red500,
    secondaryVariant = Red900,
    onSecondary = Color.Black,
    error = Red800,
    onBackground = Color.White
)

private val LightColorPalette = lightColors(
    primary = Red500,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red500,
    secondaryVariant = Red900,
    onSecondary = Color.White,
    error = Red800,
    onBackground = Color.Black
)

@Composable
fun Feeds4UTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}