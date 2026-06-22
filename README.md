# Yiiyo Movie App

Yiiyo Movie App is the Android app version of movies.kagujje.com, featuring translated movies and TV shows from various VJs (Video Journalists) in the Luganda language.

## Features

### Core Features
- **Movie & Series Library**: Browse through extensive collection of translated movies and TV shows
- **Popular VJs**: Watch content from VJ Junior, VJ Ice, VJ Emmy, VJ Jingo, VJ Little T, and more
- **Video Playback**: Native video player with ExoPlayer support
- **Android TV Support**: Optimized for TV viewing with Leanback launcher support
- **Search Functionality**: Find specific movies and series quickly
- **Responsive Design**: Material Design 3 with dark theme support

### UI Components
- **Home Screen**: Latest movies and series in horizontal rows
- **Movie Details**: Comprehensive movie information with play button
- **Video Player**: Full-screen video playback with controls
- **Navigation**: Smooth transitions between screens

## Architecture

### Project Structure
```
com.yiyo.movies
├── data/
│   ├── api/              # API services
│   │   ├── MovieApiService.kt
│   │   └── RetrofitClient.kt
│   └── model/            # Data models
│       └── Movie.kt
├── ui/
│   ├── components/       # UI components
│   │   └── MovieCard.kt
│   ├── screens/          # App screens
│   │   ├── HomeScreen.kt
│   │   ├── DetailsScreen.kt
│   │   └── PlayerScreen.kt
│   └── theme/            # App theming
│       ├── YiyoTheme.kt
│       └── Typography.kt
└── MainActivity.kt       # Entry point
```

### Technology Stack

#### Language & Framework
- **Kotlin**: Modern programming language
- **Jetpack Compose**: Declarative UI framework
- **Android TV**: Built-in support for TV viewing

#### Dependencies
- **Retrofit**: REST API client for network requests
- **ExoPlayer**: Video playback engine
- **Coil**: Image loading library
- **Navigation Compose**: Navigation framework
- **Material Design 3**: Modern UI components

#### Architecture
- **MVVM**: Model-View-ViewModel pattern
- **Clean Architecture**: Separation of concerns
- **Dependency Injection**: Lazy initialization for API clients

## API Integration

### Base URL
```
https://movies.kagujje.com/api/
```

### Endpoints
- `GET /movies?type=movies` - Get movies
- `GET /movies?type=series` - Get series
- `GET /movies?q={query}` - Search movies
- `GET /movies?id={id}` - Get movie details

### Data Models

#### Movie.kt
```kotlin
data class Movie(
    val id: String,
    val title: String,
    val overview: String?,
    val vj: String?,           // Video Journalist (e.g., "Junior", "Ice")
    val poster: String?,
    val genres: List<String>?,
    val rating: Double?,
    val releaseDate: String?,
    val videoUrl: String?,
    val tgStreamUrl: String?,
    val playableUrl: String?,
    val source: String?
)
```

## UI Components

### MovieCard.kt
Compact card component displaying:
- Movie poster (using Coil)
- Movie title
- VJ name (if available)
- Clickable to navigate to details

### HomeScreen.kt
Main screen featuring:
- Latest movies in horizontal row
- Latest series in horizontal row
- Loading indicators while fetching data
- Section headers for better organization

### DetailsScreen.kt
Movie details screen including:
- Movie poster
- Title and VJ information
- Movie overview/description
- Play button to start video

### PlayerScreen.kt
Video player screen:
- Full-screen video playback using ExoPlayer
- Back button to return to details
- Proper resource cleanup on exit

## Build Configuration

### Gradle Setup
- **compileSdk**: 34
- **minSdk**: 21
- **targetSdk**: 34
- **Kotlin**: 1.9.24
- **Compose**: 2024.05.00

### Dependencies
```gradle
dependencies {
    // Android & Compose
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.compose.material3:material3")
    
    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")
    
    // Network
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    
    // Media
    implementation("androidx.media3:media3-exoplayer:1.3.1")
    implementation("io.coil-kt:coil-compose:2.6.0")
    
    // Android TV
    implementation("androidx.tv:tv-foundation:1.0.0-alpha11")
    implementation("androidx.tv:tv-material:1.0.0-rc01")
}
```

## Usage

### Running the App
1. Open the project in Android Studio
2. Sync Gradle files
3. Build and run on an emulator or physical device

### Key Features
- **First Launch**: App loads latest movies and series
- **Movie Selection**: Click any movie card to view details
- **Video Playback**: Tap "Play Now" to start video
- **Navigation**: Use back button to navigate between screens

## Future Enhancements

### Planned Features
- **User Accounts**: Login and personalized recommendations
- **Offline Support**: Download movies for offline viewing
- **Watch History**: Track watched movies and series
- **Social Features**: Share movies with friends
- **Advanced Search**: Filter by VJ, genre, release year
- **Multi-language Support**: Switch between languages

### Performance Improvements
- **Lazy Loading**: Load images and videos as needed
- **Caching**: Cache movie data for faster loading
- **Background Processing**: Handle network requests in background

## License
This project is part of the Kagujje ecosystem. For more information about Kagujje, visit [kagujje.com](https://kagujje.com).
