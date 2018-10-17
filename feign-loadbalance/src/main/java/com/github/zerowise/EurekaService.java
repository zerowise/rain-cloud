package com.github.zerowise;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 ** @createtime : 2018/10/17下午7:56
 **/
@FeignClient("EUREKA-CLIENT")
public interface EurekaService {

    @RequestMapping("/")
    String home();
}
