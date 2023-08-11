package com.s2w.asm.domain

import com.s2w.asm.domain.BaseCreatedTimeEntity
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
open class BaseEntity : BaseCreatedTimeEntity() {

    @LastModifiedDate
    var lastModifiedDate = LocalDateTime.MIN
        private set

    @LastModifiedBy
    var lastModifiedBy = ""
        private set
}
