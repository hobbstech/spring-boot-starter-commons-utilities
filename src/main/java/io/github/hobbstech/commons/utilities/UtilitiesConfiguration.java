package io.github.hobbstech.commons.utilities;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@ComponentScan(basePackages = "io.github.hobbstech.commons.utilities")
@EnableJpaAuditing
public class UtilitiesConfiguration {
}
