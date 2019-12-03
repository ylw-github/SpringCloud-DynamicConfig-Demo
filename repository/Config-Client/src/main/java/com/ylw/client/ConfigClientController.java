package com.ylw.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${user:defalut}")
    private String user;

	@Value("${sex:defalut}")
	private String sex;

	@Value("${blog:defalut}")
	private String blog;

    @RequestMapping("/getUserInfo2")
    public String getUserInfo2() {
		return "userName -> " + user + "  sex -> " + sex + "  blog -> " + blog;
    }

}
