package kr.ac.kumoh.s20211040.GameListBackend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://gamelist-frontend.netlify.app/"])
@RequestMapping("/api/message")
class MessageController {

    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}