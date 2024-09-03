package com.marcsedev.rickmorty.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.marcsedev.rickmorty.data.RickMortyRepository
import com.marcsedev.rickmorty.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickMortyListViewModel @Inject constructor(rickMortyRepository: RickMortyRepository) :
    ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickMortyRepository.getAllCharacters()

}