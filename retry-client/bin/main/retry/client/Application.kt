package retry.client

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("retry.client")
                .mainClass(Application.javaClass)
                .start()
    }
}