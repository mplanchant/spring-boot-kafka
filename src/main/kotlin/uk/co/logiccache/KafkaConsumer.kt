package uk.co.logiccache

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class KafkaConsumer {
    @KafkaListener(
        topics = ["\${application.kafka-topic-name}"],
        groupId = "\${spring.kafka.consumer.group-id}"
    )
    fun consume(user: User) {
        logger.info { "User received $user" }
    }
}