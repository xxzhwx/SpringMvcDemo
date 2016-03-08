package com.xxzhwx.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/message")
public class MessageController {

    @RequestMapping(value = "/{msg}", method = RequestMethod.GET)
    public String showMessage(@PathVariable String msg, HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("message", msg); // 设置返回消息
        return "message"; // 设置返回页面，这里对应 /WEB-INF/view 目录下的 message.ftl 文件
    }

    @RequestMapping(value = "/add")
    public String addMessage(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("message", "message is added");
        return "message";
    }
}
