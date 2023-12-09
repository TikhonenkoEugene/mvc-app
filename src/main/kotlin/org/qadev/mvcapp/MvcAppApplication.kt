package org.qadev.mvcapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvcAppApplication

fun main(args: Array<String>) {
	runApplication<MvcAppApplication>(*args)
}
