package jp.ac.it_college.std.s23024.demo

import HelloRequest
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("greeter")
class GreeterController(
    private val greeter: Greeter,

    @Qualifier("JapaneseMessageService")
    private val messageService: MessageService
) {
    @GetMapping("/welcome")
    fun welcome(): HelloResponse {
        return HelloResponse(messageService.welcom())
    }

    @GetMapping("/hello/byservice/{name}")
    fun helloByService(@PathVariable("name") name: String): HelloResponse {
        val message = greeter.seyHello(name)
        return HelloResponse(message)
    }

    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }

    @GetMapping("/hello/{name}")
    fun helloPathValue(@PathVariable("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }
}