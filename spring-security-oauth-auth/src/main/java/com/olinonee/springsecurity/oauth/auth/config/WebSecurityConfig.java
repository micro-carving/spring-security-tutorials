package com.olinonee.springsecurity.oauth.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * SpringSecurity 安全配置类
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2023-06-14
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)//全局方法拦截
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 配置内存模式默认账户用以认证
        auth.inMemoryAuthentication()
                // 账户名
                .withUser("admin")
                // 密码（必须 encode 加密）
                .password(passwordEncoder().encode("123456"))
                // 角色
                .roles("ADMIN")
                .and()
                .withUser("guest")
                .password(passwordEncoder().encode("123456"))
                .roles("GUEST");
    }
}

