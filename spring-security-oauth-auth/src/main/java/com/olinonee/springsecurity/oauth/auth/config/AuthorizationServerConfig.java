package com.olinonee.springsecurity.oauth.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权服务器配置类
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2023-06-14
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 基于内存存储
        clients.inMemory()
                // client_id(请求授权码的客户端/应用id)
                .withClient("client_id")
                // client_secret(请求授权码的客户端/应用密钥)
                .secret(passwordEncoder.encode("client_secret"))
                // 授权模式（分为：简单模式，授权码模式，密码模式，客户端模式）
                .authorizedGrantTypes("authorization_code")
                // 客户端/应用授权范围
                .scopes("app")
                // 授权码模式下通过回调地址返回授权码给 gateway 或者 app 应用
                .redirectUris("http://localhost:8080");
    }
}
