package com.github.tejmpy.kotlin_rest_api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WebBackendApp

fun main(args: Array<String>) {
    SpringApplication.run(WebBackendApp::class.java, *args)
}
