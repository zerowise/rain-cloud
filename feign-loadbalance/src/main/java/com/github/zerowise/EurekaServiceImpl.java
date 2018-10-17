package com.github.zerowise;

import org.springframework.stereotype.Component;

/**
 ** @createtime : 2018/10/17下午8:21
 **/

@Component
public class EurekaServiceImpl implements EurekaService {
    @Override
    public String home() {
        System.out.println("EurekaService is not available !");
        return "EurekaService is not available !";
    }
}
