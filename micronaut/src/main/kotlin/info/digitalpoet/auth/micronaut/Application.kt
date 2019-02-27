package info.digitalpoet.auth.micronaut

import io.micronaut.runtime.Micronaut

fun main(args: Array<String>)
{
    Micronaut.build(*args)
        .packages("info.digitalpoet.auth")
        .mainClass(Application::class.java)
        .start()
}

class Application
