package com.jdiazsegura.idle_game.service

import User
import com.jdiazsegura.idle_game.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.util.*

@Component
class UserServiceImpl(
    private val userRepository: UserRepository
):UserService {

    override fun getUserById(userId: UUID): User? {
        return userRepository.getById(userId)
    }
}