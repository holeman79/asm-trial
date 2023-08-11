package com.s2w.asm.domain.asset.dto.response

import com.s2w.asm.domain.DomainType

class CriticalLeakSubdomainDto(
    val subDomainName: String,
    val domainType: DomainType,
    val number: Long,
    val dataSources: List<String>
)
