package com.yiyo.movies.data.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val data: List<Movie>?
)

data class SingleMovieResponse(
    val data: Movie?
)

data class Movie(
    val id: String,
    val title: String,
    val overview: String?,
    val vj: String?,
    val poster: String?,
    val genres: List<String>?,
    val rating: Double?,
    @SerializedName("release_date") val releaseDate: String?,
    @SerializedName("video_url") val videoUrl: String?,
    @SerializedName("tg_stream_url") val tgStreamUrl: String?,
    @SerializedName("playable_url") val playableUrl: String?,
    val source: String?
)
