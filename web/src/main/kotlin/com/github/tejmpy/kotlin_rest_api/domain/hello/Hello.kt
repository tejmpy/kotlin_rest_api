package com.github.tejmpy.kotlin_rest_api.domain.hello

import javax.validation.Valid

class Hello(
    @field: Valid val message: HelloMessage
)