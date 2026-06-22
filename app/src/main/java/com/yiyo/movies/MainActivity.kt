package com.yiyo.movies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.yiyo.movies.ui.screens.DetailsScreen
import com.yiyo.movies.ui.screens.HomeScreen
import com.yiyo.movies.ui.screens.PlayerScreen
import com.yiyo.movies.ui.theme.YiyoTheme
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YiyoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onMovieClick = { movie ->
                    navController.navigate("details/${movie.id}")
                }
            )
        }
        composable(
            route = "details/{movieId}",
            arguments = listOf(navArgument("movieId") { type = NavType.StringType })
        ) { backStackEntry ->
            val movieId = backStackEntry.arguments?.getString("movieId") ?: ""
            DetailsScreen(
                movieId = movieId,
                onBack = { navController.popBackStack() },
                onPlay = { url ->
                    val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
                    navController.navigate("player/$encodedUrl")
                }
            )
        }
        composable(
            route = "player/{videoUrl}",
            arguments = listOf(navArgument("videoUrl") { type = NavType.StringType })
        ) { backStackEntry ->
            val videoUrl = backStackEntry.arguments?.getString("videoUrl") ?: ""
            PlayerScreen(
                videoUrl = videoUrl,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
