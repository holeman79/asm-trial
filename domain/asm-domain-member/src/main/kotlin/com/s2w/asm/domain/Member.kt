package com.s2w.asm.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "MEMBERS")
class Member(
    val email: String,
    password: String
) : BaseEntity() {
    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    var password: String = password
        private set
}
