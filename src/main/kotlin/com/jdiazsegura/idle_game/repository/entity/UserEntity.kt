package com.jdiazsegura.idle_game.repository.entity

import User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val name: String?,
    val points: Int?,
    val level: Int?,
    val coins: Int?,
){
    companion object{
        fun fromUser(user: User) = UserEntity(
            id = user.id,
            name = user.name,
            points = user.points,
            level = user.level,
            coins = user.coins
        )
    }

    fun toUser() = User(
        id = id,
        name = name.orEmpty(),
        points = points!!,
        level = level!!,
        coins = coins!!,
    )
}