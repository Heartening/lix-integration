package com.lix.controller;

import com.lix.entity.Userlogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    // jump
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doLogin() throws Exception {
        return "../../login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Userlogin userlogin) throws Exception {

        System.out.println("aaaaaaaaa");
        // Shiro
        UsernamePasswordToken token = new UsernamePasswordToken(
                userlogin.getUsername(), userlogin.getPassword());
        Subject subject = SecurityUtils.getSubject();

        System.out.println(userlogin.getUsername());

        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        subject.login(token);
        if (subject.hasRole("admin")) {
            System.out.println("admin");
            return "admin/showCourse";
        }
                  // return "redirect:admin/showCourse";
        else if (subject.hasRole("student")) {
            System.out.println("student");
            return "student/showCourse";

        }
                 //  return "redirect:student/showCourse";
        else if (subject.hasRole("teacher")) {
            System.out.println("teacher");
            return "teacher/showCourse";
            //  return "redirect:teacher/showCourse";
        }
        System.out.println("aaaaaaaaa");

       // return "redirect:n/showCourse";
        return "../../login";
    }
}
