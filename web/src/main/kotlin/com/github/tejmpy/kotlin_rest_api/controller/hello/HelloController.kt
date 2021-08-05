package com.github.tejmpy.kotlin_rest_api.controller.hello

import com.github.tejmpy.kotlin_rest_api.controller.ApiPath
import com.github.tejmpy.kotlin_rest_api.domain.hello.HelloMessage
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping(ApiPath.Hello.getHello)
    fun getHello(): ResponseEntity<ApiInfo.GetHello> {
        return ResponseEntity.ok().body(
            ApiInfo.GetHello(
                HelloMessage("Hello!")
            )
        )
    }

}