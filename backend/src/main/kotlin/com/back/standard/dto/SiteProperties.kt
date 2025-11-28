package com.back.standard.dto

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "custom.site")
data class SiteProperties(
    val domain: String,
    val frontUrl: String,
    val backUrl: String
)