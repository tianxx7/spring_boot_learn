package com.txxc.durid

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.sql.DataSource

@RestController
@SpringBootApplication
class DruidDemoApplication : CommandLineRunner {
    private val logger: Logger = LoggerFactory.getLogger(DruidDemoApplication::class.java)

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    @GetMapping("/get")
    fun get(): String {
        return "love skye";
    }

    @Autowired
    private lateinit var dataSource: DataSource

    override fun run(vararg args: String?) {
        logger.info(dataSource.toString())

    }
}

fun main(args: Array<String>) {
    runApplication<DruidDemoApplication>(*args)
}
