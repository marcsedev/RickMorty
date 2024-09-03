package com.marcsedev.rickmorty.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import com.marcsedev.rickmorty.presentation.model.CharacterModel

@Composable
fun RickMortyListScreen(rickMortyListViewModel: RickMortyListViewModel = hiltViewModel()) {
    val characters = rickMortyListViewModel.characters.collectAsLazyPagingItems()

    CharactersList(characters)

}

@Composable
fun CharactersList(characters: LazyPagingItems<CharacterModel>) {

    LazyColumn {
        items(characters.itemCount) {
            characters[it]?.let { characterModel ->
                ItemList(characterModel)
            }
        }
    }
}

@Composable
fun ItemList(characterModel: CharacterModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) { AsyncImage(characterModel.image, contentDescription = characterModel.name)
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = characterModel.name, color = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = if (characterModel.isAlive) "Alive" else "Dead", color = Color.White)

            }


        }
    }
}
