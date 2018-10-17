package com.github.zerowise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EurekaService {
    @Autowired
    RestTemplate restTemplate;

    public String getEurekaContent() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/",String.class);
    }
}