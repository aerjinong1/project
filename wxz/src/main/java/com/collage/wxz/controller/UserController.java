package com.collage.wxz.controller;

import com.collage.wxz.entity.User;
import com.collage.wxz.service.IUserservice;
import com.collage.wxz.util.JsonResult;
import com.collage.wxz.util.JwtUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

//@Controller
@RestController
@RequestMapping("user")
public class UserController extends BaseController {
    protected final String name = "ad";

    @Autowired
    protected IUserservice userservice;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        userservice.reg(user);
        return new JsonResult<>(OK);
    }

    @RequestMapping("login")
    public JsonResult<User> login(int studentId, String password, HttpSession session) {
        User res = userservice.login(studentId,password);
        session.setAttribute("studentID", studentId);



        return new JsonResult<User>(OK,res);
    }
    @RequestMapping("getstuId")
    public JsonResult<User> getstuId(HttpSession session){
        User user = userservice.getstuId(getuidFromSession(session));
        return new JsonResult<>(OK,user);
    }
}
