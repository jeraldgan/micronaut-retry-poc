package retry.server1

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("retry.server1")
                .mainClass(Application.javaClass)
                .start()
    }
}