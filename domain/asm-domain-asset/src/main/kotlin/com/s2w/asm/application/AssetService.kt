package com.s2w.asm.application

import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AssetService(

) {
    @Transactional(readOnly = true)
    fun get(seedId: String, pageable: Pageable) {

    }
}
