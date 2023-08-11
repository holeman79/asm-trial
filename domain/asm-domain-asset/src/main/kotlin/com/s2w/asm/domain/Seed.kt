package com.s2w.asm.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "SEEDS")
class Seed(
    val name: String
) {
    @Id
    @Column(name = "SEED_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
}
