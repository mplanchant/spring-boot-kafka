package uk.co.logiccache

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig(
    private val properties: ApplicationProperties
) {

    @Bean
    fun myTopic(): NewTopic = TopicBuilder.name(properties.kafkaTopicName).build()
}
