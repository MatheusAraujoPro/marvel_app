package com.example.domain.model

data class CharacterModel(
    var id: String,
    var name: String,
    var description: String,
    var thumbnail: Thumbnail,
    var bookMark: Boolean
)