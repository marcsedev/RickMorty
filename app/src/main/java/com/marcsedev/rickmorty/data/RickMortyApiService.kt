package com.marcsedev.rickmorty.data

import com.marcsedev.rickmorty.data.response.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyApiService {
    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int): Response<CharacterResponse>

}