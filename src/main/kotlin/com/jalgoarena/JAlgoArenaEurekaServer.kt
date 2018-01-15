package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
open class JAlgoArenaEurekaServer {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(JAlgoArenaEurekaServer::class.java, *args)
        }
    }
}