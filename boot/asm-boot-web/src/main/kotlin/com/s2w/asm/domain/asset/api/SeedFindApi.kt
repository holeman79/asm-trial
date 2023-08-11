package com.s2w.asm.domain.asset.api

import com.s2w.asm.domain.asset.dto.response.SeedDto
import com.s2w.asm.global.response.ApiResponse
import java.time.LocalDate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/seeds")
class SeedFindApi(

) {
    @GetMapping("/{seedId}")
    fun findSeed(@PathVariable seedId: String): ApiResponse<SeedDto> {
        return ApiResponse.OK(SeedDto("abc.com", "10.0.0.5", "Goolge Provider", LocalDate.now(),
        3, 5))
    }
}
