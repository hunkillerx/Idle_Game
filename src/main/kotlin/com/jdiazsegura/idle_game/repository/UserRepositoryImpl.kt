package com.jdiazsegura.idle_game.repository

import User
import com.jdiazsegura.idle_game.repository.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class UserRepositoryImpl(val repo: UserRepositorySpringData):UserRepository {
    override fun getById(id: UUID): User? {
       return repo.findUserById(id.toString())?.toUser()
    }

    override fun newUser(user: User): User? {
        return repo.save(user.toEntity()).toUser()
    }
}

@Repository
interface UserRepositorySpringData:CrudRepository<UserEntity,UUID>{
    fun findUserById(id: String): UserEntity?
}