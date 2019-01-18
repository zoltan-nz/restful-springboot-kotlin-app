package nz.zoltan.restfulspringbootkotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulSpringbootKotlinAppApplication

fun main(args: Array<String>) {
    runApplication<RestfulSpringbootKotlinAppApplication>(*args)
}