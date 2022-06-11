package io.michaelreid.backend

import java.util.Random
import java.util.stream.LongStream
import kotlin.streams.toList
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    private val random = Random()

    @GetMapping(path = ["/numbers"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun numbers(): ResponseEntity<Map<String, List<Long>>> {
        val numbers = LongStream.range(0, 10).map {
            random.nextLong()
        }.toList()

        val data = mapOf("data" to numbers)

        return ResponseEntity.ok(data)
    }

}