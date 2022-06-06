package org.myshowtime.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.myshowtime"})
@EnableJpaRepositories("org.myshowtime.*")
@EntityScan({"org.myshowtime.*"})
public class MyShowTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShowTimeApplication.class, args);
    }
}
