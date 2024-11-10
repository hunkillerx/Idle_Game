package com.jdiazsegura.idle_game.repository

import User
import com.jdiazsegura.idle_game.repository.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class UserRepositoryImpl(val repo: UserRepositorySpringData):UserRepository {
    override fun getById(id: UUID): User? {
       return repo.findUserById(id)?.toUser()
    }
}

@Repository
interface UserRepositorySpringData:CrudRepository<UserEntity,UUID>{
    fun findUserById(id: UUID): UserEntity?
}