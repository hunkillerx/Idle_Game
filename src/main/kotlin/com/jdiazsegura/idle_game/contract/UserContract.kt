package com.jdiazsegura.idle_game.contract

import User
import com.jdiazsegura.idle_game.controller.dtos.UserDto
import com.jdiazsegura.idle_game.service.model.ResponseModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@RequestMapping()
interface UserContract {
    @GetMapping("/api/users/id")
    fun getUserById(
        @RequestBody
        dto: UserDto
    ): ResponseEntity<ResponseModel>

    @PostMapping("/api/user/new")
    fun newUser(user: User): ResponseEntity<ResponseModel>
}