package com.itgaoshu.controller;

import com.itgaoshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.itgaoshu.bean.User;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("select.do")
    public String selectuser(Model model){
       List<User> users= userService.selectuser();
       model.addAttribute("users",users);
    return "login2";

    }
}
