package org.user.service.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.user.service.dto.User;

/**
 * User API服务
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserEndpoint {
    protected Logger logger = LoggerFactory.getLogger(UserEndpoint.class);

    @Value("${server.port:2200}")
    private int serverPort = 2200;

    @RequestMapping(value = "/{loginName}", method = RequestMethod.GET)
    public User detail(@PathVariable String loginName) {
        String memos = "I come form " + this.serverPort;
        return new User(loginName, loginName, "/avatar/default.png", memos);
    }
}
