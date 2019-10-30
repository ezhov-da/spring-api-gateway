package ru.ezhov.springapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiGatewayApplication.class, args);
    }

}
