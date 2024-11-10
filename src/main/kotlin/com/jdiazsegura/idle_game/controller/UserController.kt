package com.jdiazsegura.idle_game.controller

import User
import com.jdiazsegura.idle_game.contract.UserContract
import com.jdiazsegura.idle_game.controller.dtos.UserDto
import com.jdiazsegura.idle_game.service.UserService
import com.jdiazsegura.idle_game.service.model.ResponseModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController(
    private val userService: UserService
):UserContract {


    override fun getUserById(dto: UserDto): ResponseEntity<ResponseModel> {
        return userService.getUserById(dto.id!!)
    }

    override fun newUser(user: User): ResponseEntity<ResponseModel> {
        TODO("Not yet implemented")
    }
}