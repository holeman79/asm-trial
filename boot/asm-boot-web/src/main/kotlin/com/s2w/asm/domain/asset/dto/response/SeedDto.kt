package com.s2w.asm.domain.asset.dto.response

import java.time.LocalDate

class SeedDto(
    val domainName: String,
    val ip: String,
    val cloudProvider: String,
    val scanDate: LocalDate,
    val leftCount: Int,
    val availableCount: Int
)
