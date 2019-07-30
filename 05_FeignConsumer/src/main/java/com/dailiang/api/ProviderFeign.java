package com.dailiang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: D&L
 * @Description:
 * @Date: 2019-07-30 21:00
 */
//name 指定服务名称
@FeignClient(name = "eureka-provider")
public interface ProviderFeign {

    @RequestMapping("/geProvider")
    public String geProvider();
}
