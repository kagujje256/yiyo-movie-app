package com.yiyo.movies.data.api

import com.yiyo.movies.data.model.MovieResponse
import com.yiyo.movies.data.model.SingleMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movies")
    suspend fun getMovies(
        @Query("type") type: String = "movies",
        @Query("limit") limit: Int = 100,
        @Query("vj") vj: String? = null,
        @Query("genre") genre: String? = null
    ): MovieResponse

    @GET("movies")
    suspend fun searchMovies(
        @Query("q") query: String
    ): MovieResponse

    @GET("movies")
    suspend fun getMovieDetails(
        @Query("id") id: String
    ): SingleMovieResponse
}
