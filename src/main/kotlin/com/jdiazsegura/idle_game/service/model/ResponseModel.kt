package com.jdiazsegura.idle_game.service.model

import java.util.UUID

data class ResponseModel(
    val id: UUID,
    val name: String,
    val points: Int,
    val level: Int,
    val coins: Int,
)