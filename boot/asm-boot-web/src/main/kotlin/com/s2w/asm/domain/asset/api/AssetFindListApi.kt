package com.s2w.asm.domain.asset.api

import com.s2w.asm.application.AssetService
import com.s2w.asm.domain.DomainType
import com.s2w.asm.domain.asset.dto.response.SubDomainDto
import com.s2w.asm.global.response.ApiResponse
import com.s2w.asm.global.response.PageDto
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/assets")
class AssetFindListApi(
    private val assetService: AssetService
) {
    @GetMapping
    fun findAssets(@RequestParam seedId: String, pageable: Pageable): ApiResponse<PageDto<SubDomainDto>> {
        return ApiResponse.OK(PageDto(PageImpl(listOf(SubDomainDto(name = "www.googlekc.com", domainType = DomainType.DEV,
            status = "active", ip = "10.0.40.246", ports = listOf(), services = listOf())))))
    }
}
