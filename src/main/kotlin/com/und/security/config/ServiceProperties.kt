package com.und.security.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("auth-client")
class ServiceProperties {

    private val authPath: String = "/auth"

}

