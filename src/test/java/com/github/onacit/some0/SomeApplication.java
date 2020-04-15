package com.github.onacit.some0;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.github.onacit.spring.boot.issue447", "com.github.onacit.some0"})
@EnableTransactionManagement
@EnableJpaRepositories
@SpringBootApplication
@Slf4j
public class SomeApplication {

    public static void main(final String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(SomeApplication.class, args);
    }
}
