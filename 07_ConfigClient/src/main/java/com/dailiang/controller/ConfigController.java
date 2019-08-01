package com.dailiang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: D&L
 * @Description:
 * @Date: 2019-08-01 10:58
 */
@RestController
//@RefreshScope //开启更新功能
public class ConfigController {
    @Value("${dailiang:dailiangaini}")
    private String dailiang;

    @RequestMapping("/dailiang")
    private String dailiang() {
        return dailiang;
    }

}
