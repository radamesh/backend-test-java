package com.backend.test.java.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.backend.test.java.repository")
public class RepositoryConfig {
}
