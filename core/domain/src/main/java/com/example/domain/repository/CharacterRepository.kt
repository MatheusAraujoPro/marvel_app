package com.example.domain.repository

import com.example.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacterByName(nameOfCharacter: String): Flow<CharacterModel>
    fun getCharacterById(IdOfCharacter: String): Flow<CharacterModel>
    fun favoriteCharacter(characterModel: CharacterModel):Flow<CharacterModel>
    fun getFavoriteCharacters(): Flow<List<CharacterModel>>
}