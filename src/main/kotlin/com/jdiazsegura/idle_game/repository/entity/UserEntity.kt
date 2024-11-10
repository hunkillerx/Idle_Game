package com.jdiazsegura.idle_game.repository.entity

import User
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users")
data class UserEntity(

    @Id
    val id: String? = null,
    val name: String?,
    val points: Int?,
    val level: Int?,
    val coins: Int?,
){
    companion object{

    }

    fun toUser() = User(
        id = UUID.fromString(id),
        name = name.orEmpty(),
        points = points!!,
        level = level!!,
        coins = coins!!,
    )
}