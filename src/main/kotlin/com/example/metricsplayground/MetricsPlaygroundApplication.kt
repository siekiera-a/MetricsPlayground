package com.example.metricsplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetricsPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<MetricsPlaygroundApplication>(*args)
}
