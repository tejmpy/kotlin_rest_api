package com.github.tejmpy.kotlin_rest_api.controller.hello

import com.github.tejmpy.kotlin_rest_api.domain.hello.HelloMessage

object ApiInfo {

    data class GetHello(
        val message: HelloMessage
    )

}