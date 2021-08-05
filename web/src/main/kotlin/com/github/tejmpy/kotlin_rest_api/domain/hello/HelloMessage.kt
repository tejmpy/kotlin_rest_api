package com.github.tejmpy.kotlin_rest_api.domain.hello

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class HelloMessage(
    @field: [NotBlank Size(max = 1000)] val value: String
)