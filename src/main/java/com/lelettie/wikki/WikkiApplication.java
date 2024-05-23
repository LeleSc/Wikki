package com.lelettie.wikki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WikkiApplication {
    private static final Logger LOG = LoggerFactory.getLogger(WikkiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikkiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Initialization Successful!");
        LOG.info("Address: http://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
