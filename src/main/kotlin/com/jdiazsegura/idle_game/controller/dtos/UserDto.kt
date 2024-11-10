package com.jdiazsegura.idle_game.controller.dtos

import User
import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

@Schema(name = "UserDto")
data class UserDto(
    val id: UUID?,
    val name: String?,
    val points: Int?,
    val level: Int?,
    val coins: Int?,
) {
    fun toModel() = User(
        id = id,
        name = name!!,
        points = points!!,
        level = level!!,
        coins = coins!!
    )

}