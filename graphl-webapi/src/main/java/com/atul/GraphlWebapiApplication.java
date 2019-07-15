package com.atul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.atul")
@SpringBootApplication
public class GraphlWebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphlWebapiApplication.class, args);
    }

}
