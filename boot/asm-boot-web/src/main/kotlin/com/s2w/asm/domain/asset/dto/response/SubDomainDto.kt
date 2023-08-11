package com.s2w.asm.domain.asset.dto.response

import com.s2w.asm.domain.DomainType

class SubDomainDto(
    val name: String,
    val domainType: DomainType,
    val status: String,
    val ip: String,
    val ports: List<Int>,
    val services: List<String>
)
