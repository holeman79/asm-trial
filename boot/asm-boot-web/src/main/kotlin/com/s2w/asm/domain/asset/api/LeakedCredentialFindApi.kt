package com.s2w.asm.domain.asset.api

import com.s2w.asm.domain.asset.dto.response.LeakedCredentialCountDto
import com.s2w.asm.global.response.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/leaked-credentials")
class LeakedCredentialFindApi(

) {
    @GetMapping("/statistics")
    fun findServices(@RequestParam seedId: String): ApiResponse<LeakedCredentialCountDto> {
        return ApiResponse.OK(LeakedCredentialCountDto(1000L, 100L, 1100L,
        50L, listOf()))
    }
}
