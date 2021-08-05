package com.github.tejmpy.kotlin_rest_api.controller

object ApiPath {
    private const val base = "/api"

    const val hello = "$base/hello"

    object Hello {
        const val getHello = hello
    }
}