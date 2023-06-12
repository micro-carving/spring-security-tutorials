package com.olinonee.springsecurity.oauth.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 资源服务器启动器
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2023-06-12
 */
@SpringBootApplication
public class ResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }
}
