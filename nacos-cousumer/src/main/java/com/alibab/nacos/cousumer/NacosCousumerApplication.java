package com.alibab.nacos.cousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosCousumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosCousumerApplication.class, args);
    }
}
