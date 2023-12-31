package org.qadev.mvcapp.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class MainController {

    @GetMapping("hello/{name}")
    fun getGreeting(@PathVariable name: String): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, $name ;)")
    }
}