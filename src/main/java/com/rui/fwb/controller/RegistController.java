package com.rui.fwb.controller;

import com.rui.fwb.service.impl.StudentServiceImpl;
import com.rui.fwb.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RegistController {
    @Resource
    private StudentServiceImpl studentService;
    @PostMapping("/regist")
    @ResponseBody
    public String Sregist(Student student){
       studentService.Insert(student.getName(),student.getPasswd(),student.getCla(),student.getRealName());
        return "ok";
    }
}
