package com.github.zerowise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class FeignLoadbalanceApplication {
    @Autowired
    EurekaService eurekaService;

    public static void main(String[] args) {
        SpringApplication.run(FeignLoadbalanceApplication.class, args);
    }



    @RequestMapping("/index")
    public String home(){
        return eurekaService.home();
    }
}
