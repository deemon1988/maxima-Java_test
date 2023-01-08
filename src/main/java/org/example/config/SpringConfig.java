package org.example.config;

import org.example.model.Sphynx;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {
    /*@Bean
    public Logistics logistics() {
        return new Logistics();
    }*/

    @Bean("hairless")
    public Sphynx sphynx() {
        return new Sphynx();
    }

}
