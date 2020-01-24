package io.github.hobbstech.commons.utilities;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "io.github.hobbstech.commons.utilities")
@EntityScan(basePackages = "io.github.hobbstech.commons.utilities")
@EnableJpaRepositories(basePackages = "io.github.hobbstech.commons.utilities")
@EnableJpaAuditing
public class UtilitiesConfiguration {
}
