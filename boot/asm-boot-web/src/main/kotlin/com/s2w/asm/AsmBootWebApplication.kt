package com.s2w.asm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AsmBootWebApplication

fun main(args: Array<String>) {
	//System.setProperty("spring.config.name", "application-local,application-asset")
	runApplication<AsmBootWebApplication>(*args)
}
