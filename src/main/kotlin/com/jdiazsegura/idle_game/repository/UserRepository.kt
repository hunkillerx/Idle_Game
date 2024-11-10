package com.jdiazsegura.idle_game.repository

import User
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository {
    fun getById(id: UUID) : User?
    fun newUser(user: User) : User?
}