package me.afibarra.coding.learning.springbootpayaramicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class SpringbootPayaramicroApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootPayaramicroApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPayaramicroApplication.class, args);
    }
}
