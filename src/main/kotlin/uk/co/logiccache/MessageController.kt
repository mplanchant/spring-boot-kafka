package uk.co.logiccache

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/kafka")
class MessageController(
    private val kafkaProducer: KafkaProducer
) {

    @PostMapping("/publish")
    fun publish(@RequestBody user: User): ResponseEntity<String> {
        kafkaProducer.sendMessage(user)
        return ResponseEntity.ok("Message published")
    }

}
