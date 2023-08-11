package com.s2w.asm.domain.asset.dto.response

class LeakedCredentialCountDto(
    val totalComboListCount: Long,
    val totalMalwareCount: Long,
    val totalCount: Long,
    val totalCriticalCount: Long,
    val monthlyLeakedCredentialCounts: List<MonthlyLeakedCredentialCount>
) {
    class MonthlyLeakedCredentialCount private constructor(
        val yearMonth: String,
        val comboListCount: Long,
        val malwareCount: Long,
        val criticalCount: Long
    )
}
