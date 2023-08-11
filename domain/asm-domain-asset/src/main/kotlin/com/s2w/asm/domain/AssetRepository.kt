package com.s2w.asm.domain

import org.springframework.data.jpa.repository.JpaRepository

interface AssetRepository : JpaRepository<Asset, Long>
