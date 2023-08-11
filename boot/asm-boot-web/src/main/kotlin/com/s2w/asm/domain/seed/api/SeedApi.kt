package com.s2w.asm.domain.seed.api

import com.s2w.asm.application.SeedService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/seeds")
class SeedApi(
    private val seedService: SeedService
) {

}
