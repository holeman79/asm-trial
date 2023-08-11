package com.s2w.asm.domain.asset.api

import com.s2w.asm.domain.asset.dto.response.RelatedVulnerabilityDto
import com.s2w.asm.global.response.ApiResponse
import com.s2w.asm.global.response.PageDto
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/leaked-credentials")
class LeakedCredentialFindListApi(

) {
    @GetMapping
    fun findServices(@RequestParam seedId: String, pageable: Pageable): ApiResponse<PageDto<RelatedVulnerabilityDto>> {
        return ApiResponse.OK(PageDto(PageImpl(listOf())))
    }
}
