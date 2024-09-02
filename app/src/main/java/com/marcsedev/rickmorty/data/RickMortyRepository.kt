package com.marcsedev.rickmorty.data

import androidx.paging.PagingData
import com.marcsedev.rickmorty.presentation.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickMortyRepository @Inject constructor(val api:RickMortyApiService) {

    fun getAllCharacters(): Flow<PagingData<CharacterModel>>{
        
    }
}