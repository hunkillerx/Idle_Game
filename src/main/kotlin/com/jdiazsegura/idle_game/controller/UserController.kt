package com.jdiazsegura.idle_game.controller

import User
import com.jdiazsegura.idle_game.contract.UserContract
import com.jdiazsegura.idle_game.controller.dtos.UserDto
import com.jdiazsegura.idle_game.service.UserService
import com.jdiazsegura.idle_game.service.model.ResponseModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) : UserContract {


    override fun getUserById(dto: UserDto): ResponseEntity<ResponseModel> {
        return ResponseEntity.ok(userService.getUserById(dto.id!!)?.toResponseModel())
    }

    override fun newUser(dto: UserDto): ResponseEntity<ResponseModel> {
        return ResponseEntity.ok(userService.newUser(dto.toModel())?.toResponseModel())
    }
}