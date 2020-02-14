package retry.server1

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class Server {

    var counter = 0

    @Get("/")
    internal fun index(): String {
        counter += 1
        println("tried $counter number of times")
        return "{\"name\":\"Server1\", \"number of times\":$counter}"
    }
}