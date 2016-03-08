package com.xxzhwx.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login")
    public String test(HttpServletRequest req, HttpServletResponse resp, User user) {
        if (user.getUsername().equals("xxzhwx")
                && user.getPassword().equals("ok")) {
            req.setAttribute("userInfo", user);
            return "users/loginOk";
        } else {
            return "users/loginErr";
        }
    }
}
