package retry.client

import io.micronaut.http.annotation.Controller
import io.micronaut.http.client.annotation.Client

@Controller("/")
@Client("server1")
class Client{
    
}