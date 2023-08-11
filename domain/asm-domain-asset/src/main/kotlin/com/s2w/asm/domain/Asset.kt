package com.s2w.asm.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "ASSETS")
class Asset(
    val name: String,
    val assetType: AssetType
) : BaseEntity() {
    @Id
    @Column(name = "ASSET_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L


}
