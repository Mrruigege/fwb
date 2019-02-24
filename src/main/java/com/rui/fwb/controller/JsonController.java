package com.rui.fwb.controller;

import com.rui.fwb.service.impl.StudentServiceImpl;
import com.rui.fwb.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {
    @Resource
    private StudentServiceImpl studentService;
    @GetMapping("/get")
    @ResponseBody
    public List<Student> get(){
        Student mike = studentService.findByName("mike");
        List<Student> list = new ArrayList<Student>();
        list.add(mike);
        list.add(mike);
        return list;
    }
   @GetMapping("/json")
    public String json(){
        return "JSON";
    }
}
