package com.example.metricsplayground

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random
import kotlin.random.nextInt
import org.springframework.stereotype.Component

@Component
class DemoMetrics(
    meterRegistry: MeterRegistry
) {

    init {
        System.err.println(meterRegistry)
    }

    private val counter: Counter = meterRegistry.counter("demo_counter")
    private val demoGauge = meterRegistry.gauge("demo_gauge", AtomicInteger(0)) as AtomicInteger

    fun getRandomMetricData() {
        demoGauge.set(getRandomNumberInRange(0, 100))
        counter.increment()
    }

    private fun getRandomNumberInRange(min: Int, max: Int): Int {
        if (min >= max) {
            throw IllegalArgumentException("Max must be grater that min")
        }

        return Random.nextInt(min..max)
    }

}
