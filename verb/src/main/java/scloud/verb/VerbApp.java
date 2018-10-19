package scloud.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class VerbApp {

    public static void main(String[] args){
        SpringApplication.run(VerbApp.class, args);
    }
}
