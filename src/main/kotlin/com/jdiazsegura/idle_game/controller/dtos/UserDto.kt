package com.jdiazsegura.idle_game.controller.dtos

import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

@Schema(name = "UserDto")
data class UserDto(
    val id: UUID?,
    val name: String?,
    val points: Int?,
    val level: Int?,
    val coins: Int?,
)