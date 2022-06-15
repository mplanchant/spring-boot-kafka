package uk.co.logiccache

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "application")
data class ApplicationProperties(val kafkaTopicName: String)