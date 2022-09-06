package com.example.metricsplayground

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class DemoMetricsScheduler(
    private val demoMetrics: DemoMetrics,
) {

    @Scheduled(fixedRate = 1000)
    fun triggerCustomMetrics() {
        demoMetrics.getRandomMetricData()
    }

}
