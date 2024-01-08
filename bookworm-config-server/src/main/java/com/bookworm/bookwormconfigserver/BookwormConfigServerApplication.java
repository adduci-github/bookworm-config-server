package com.bookworm.bookwormconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookwormConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookwormConfigServerApplication.class, args);
    }

}
