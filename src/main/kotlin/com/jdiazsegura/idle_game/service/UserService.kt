package com.jdiazsegura.idle_game.service

import User
import org.springframework.stereotype.Service
import java.util.*

interface UserService {

    fun getUserById(userId: UUID): User?
}