package com.yiyo.movies.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googleFonts
import androidx.compose.ui.unit.sp

private val googleFonts = googleFonts(
    "Roboto",
    "Roboto Slab",
    "Noto Sans",
)

val Typography = Typography(
    displayLarge = Typography().displayLarge.copy(
        fontFamily = googleFonts,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = Typography().displayMedium.copy(
        fontFamily = googleFonts,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = Typography().displaySmall.copy(
        fontFamily = googleFonts,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = Typography().headlineLarge.copy(
        fontFamily = googleFonts,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = Typography().headlineMedium.copy(
        fontFamily = googleFonts,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = Typography().headlineSmall.copy(
        fontFamily = googleFonts,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = Typography().titleLarge.copy(
        fontFamily = googleFonts,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = Typography().titleMedium.copy(
        fontFamily = googleFonts,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.1.sp
    ),
    titleSmall = Typography().titleSmall.copy(
        fontFamily = googleFonts,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    bodyLarge = Typography().bodyLarge.copy(
        fontFamily = googleFonts,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = Typography().bodyMedium.copy(
        fontFamily = googleFonts,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = Typography().bodySmall.copy(
        fontFamily = googleFonts,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    labelLarge = Typography().labelLarge.copy(
        fontFamily = googleFonts,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = Typography().labelMedium.copy(
        fontFamily = googleFonts,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = Typography().labelSmall.copy(
        fontFamily = googleFonts,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
)
