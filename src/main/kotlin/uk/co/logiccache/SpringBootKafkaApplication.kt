package uk.co.logiccache

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties::class)
class SpringBootKafkaApplication

fun main(args: Array<String>) {
    runApplication<SpringBootKafkaApplication>(*args)
}
