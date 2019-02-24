package com.rui.fwb.controller;

import com.rui.fwb.service.impl.StudentServiceImpl;
import com.rui.fwb.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LogController {
    @Resource
    private StudentServiceImpl studentService;
    @PostMapping("/log")
    @ResponseBody
    public String Loging(String name ,String passwd){
        Student student = studentService.findByName(name);
        if (student == null){
            return "index";
        }else {
            if (!passwd.equals(student.getPasswd())){
                return "index";
            }else {
                return "ok，登录成功";
            }
        }
    }
}
