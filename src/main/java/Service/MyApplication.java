package Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "Service")
public class MyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
       SpringApplication.run(MyApplication.class,args);
        SpringApplication springApplication = new SpringApplication(MyApplication.class);


    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyApplication.class);
    }
}
