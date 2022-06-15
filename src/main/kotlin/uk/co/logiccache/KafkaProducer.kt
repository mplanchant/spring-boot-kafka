package uk.co.logiccache

import mu.KotlinLogging
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class KafkaProducer(
    private val kafkaTemplate: KafkaTemplate<String, User>,
    private val properties: ApplicationProperties
) {

    fun sendMessage(user: User) {
        val message = MessageBuilder
            .withPayload(user)
            .setHeader(KafkaHeaders.TOPIC, properties.kafkaTopicName)
            .build()

        logger.info { "User sent: $user" }
        kafkaTemplate.send(message)
    }
}
