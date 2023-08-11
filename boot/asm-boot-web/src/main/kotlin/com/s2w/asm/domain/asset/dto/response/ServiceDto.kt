package com.s2w.asm.domain.asset.dto.response

class ServiceDto(
    val name: String,
    val vendor: String,
    val versions: List<String>,
    val vulnerabilities: List<String>
)
