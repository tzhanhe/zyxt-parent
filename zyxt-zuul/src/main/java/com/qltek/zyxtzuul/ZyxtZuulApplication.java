package com.qltek.zyxtzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZyxtZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyxtZuulApplication.class, args);
    }

}
