package com.example.domain.repository

import com.example.domain.model.Serie
import kotlinx.coroutines.flow.Flow

interface SerieRepository {
    fun getListSerie(): Flow<List<Serie>>
    fun getSerieByName(): Flow<Serie>
}