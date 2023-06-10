package com.olinonee.springsecurity.oauth.samples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息控制器
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2023-06-10
 */
@RestController
public class MessagesController {

    @GetMapping("/messages")
    public String[] getMessages() {
        return new String[] {"Message 1", "Message 2", "Message 3"};
    }
}
