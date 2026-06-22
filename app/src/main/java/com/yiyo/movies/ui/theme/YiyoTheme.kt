package com.yiyo.movies.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFBB86FC),
    onPrimaryContainer = Color(0xFF000000),
    secondary = Color(0xFF03DAC5),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF018786),
    onSecondaryContainer = Color(0xFF000000),
    tertiary = Color(0xFF3700B3),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFBB86FC),
    onTertiaryContainer = Color(0xFF000000),
    background = Color(0xFF0D1117),
    onBackground = Color.White,
    surface = Color(0xFF0D1117),
    onSurface = Color.White,
    surfaceVariant = Color(0xFF2D2D2D),
    onSurfaceVariant = Color(0xFFB0B0B0),
    outline = Color(0xFF505050),
    inverseOnSurface = Color(0xFF000000),
    inverseSurface = Color(0xFFE0E0E0),
    inversePrimary = Color(0xFF6200EE),
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFBB86FC),
    onPrimaryContainer = Color(0xFF000000),
    secondary = Color(0xFF03DAC5),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF018786),
    onSecondaryContainer = Color(0xFF000000),
    tertiary = Color(0xFF3700B3),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFBB86FC),
    onTertiaryContainer = Color(0xFF000000),
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF000000),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),
    surfaceVariant = Color(0xFFF0F0F0),
    onSurfaceVariant = Color(0xFF505050),
    outline = Color(0xFFC0C0C0),
    inverseOnSurface = Color(0xFFFFFFFF),
    inverseSurface = Color(0xFF000000),
    inversePrimary = Color(0xFF6200EE),
)

@Composable
fun YiyoTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
