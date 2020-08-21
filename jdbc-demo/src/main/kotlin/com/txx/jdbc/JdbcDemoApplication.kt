package com.txx.jdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JdbcDemoApplication

fun main(args: Array<String>) {
    runApplication<JdbcDemoApplication>(*args)
}
