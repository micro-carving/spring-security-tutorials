package com.olinonee.springsecurity.oauth.samples.controller;

import com.nimbusds.jose.jwk.JWKSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * jwk 控制器
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2023-06-12
 */
@RestController
public class JwkController {

    @Autowired
    private JWKSet jwkSet;

    @GetMapping(value = "/oauth2/keys", produces = "application/json; charset=UTF-8")
    public String keys() {
        return this.jwkSet.toString();
    }
}
