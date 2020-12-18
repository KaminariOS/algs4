package com.chanos.algs4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author kaminari
 */
@SpringBootApplication
@EnableSwagger2
public class Algs4Application {

    public static void main(String[] args) {
        SpringApplication.run(Algs4Application.class, args);
    }

}