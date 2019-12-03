package com.ylw.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${user:defalut}")
    private String user;

    @Value("${sex:defalut}")
    private String sex;

    @Value("${blog:defalut}")
    private String blog;

    @RequestMapping("/getUserInfo")
    private String getUserInfo() {
        return "userName -> " + user + "  sex -> " + sex + "  blog -> " + blog;
    }

}