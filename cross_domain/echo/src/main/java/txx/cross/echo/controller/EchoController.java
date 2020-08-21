package txx.cross.echo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import txx.cross.echo.common.Grill;

import javax.servlet.http.HttpServletRequest;

/**
 * 常规的get/post请求
 * 跨域注解@CrossOrigin,不使用 @see MvcConfig
 * 注解@CrossOrigin 也可以加类上
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/8
 */
@RestController
public class EchoController {

    @GetMapping("/get")
    @ResponseBody
    @CrossOrigin
    public Object echo(String str) {
        return str;
    }

    @PostMapping("/post")
    @ResponseBody
    @CrossOrigin
    public Object echo(@RequestBody Grill grill) {
        return grill.toString();
    }

    @GetMapping("/header/get")
    @ResponseBody
    @CrossOrigin
    public Object headerEcho(HttpServletRequest request, String str) {
        final String token = request.getHeader("token");
        return str + "token is " + token;
    }

    @PostMapping("/header/post")
    @ResponseBody
    @CrossOrigin
    public Object headerEcho(HttpServletRequest request,@RequestBody Grill grill) {
        final String token = request.getHeader("token");
        return grill.toString() + "token is " + token;
    }
}
