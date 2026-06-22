package com.yiyo.movies.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yiyo.movies.data.api.RetrofitClient
import com.yiyo.movies.data.model.Movie
import com.yiyo.movies.ui.components.MovieCard
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onMovieClick: (Movie) -> Unit
) {
    var movies by remember { mutableStateOf<List<Movie>>(emptyList()) }
    var series by remember { mutableStateOf<List<Movie>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            try {
                val movieResponse = RetrofitClient.movieApiService.getMovies(type = "movies")
                val seriesResponse = RetrofitClient.movieApiService.getMovies(type = "series")
                movies = movieResponse.data ?: emptyList()
                series = seriesResponse.data ?: emptyList()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                isLoading = false
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Yiiyo Movies", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { padding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                item {
                    SectionHeader("Latest Movies")
                    Spacer(modifier = Modifier.height(8.dp))
                    MovieRow(movies, onMovieClick)
                }
                item {
                    SectionHeader("Latest Series")
                    Spacer(modifier = Modifier.height(8.dp))
                    MovieRow(series, onMovieClick)
                }
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge.copy(
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        ),
        color = MaterialTheme.colorScheme.onBackground
    )
}

@Composable
fun MovieRow(
    movies: List<Movie>,
    onMovieClick: (Movie) -> Unit
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(movies) { movie ->
            MovieCard(movie = movie, onClick = { onMovieClick(movie) })
        }
    }
}
