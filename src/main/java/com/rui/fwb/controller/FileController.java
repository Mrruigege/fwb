package com.rui.fwb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {
    //https://blog.csdn.net/Colton_Null/article/details/76696674
    @GetMapping("/file")
    public String toFile(){
        return "upload";
    }
}
