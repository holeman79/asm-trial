package com.s2w.asm.application

import com.s2w.asm.domain.Seed
import com.s2w.asm.domain.SeedRepository
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SeedService(
    private val seedRepository: SeedRepository
) {
    @Transactional
    fun saveSeed() {
        seedRepository.save(Seed(name = "10.0.40.246"))
    }

    @Transactional(readOnly = true)
    fun get(memberId: Long) {
        seedRepository.findById(1L)
    }
}
