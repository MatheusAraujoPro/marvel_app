package com.example.domain.model

data class Serie(
    var id: String,
    var title: String,
    var resourceId: String,
    var thumbnail: Thumbnail,
    var charactersList: List<CharacterItem>,
    var bookMark: Boolean
)