package com.example.metricsplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class MetricsPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<MetricsPlaygroundApplication>(*args)
}
