package retry.server2

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class Server {

    var counter = 0

    @Get("/")
    internal fun index(): String {
        counter++
        println("tried $counter number of times")
        return "{\"name\":\"Server2\", \"number of times\":$counter}"
    }
}