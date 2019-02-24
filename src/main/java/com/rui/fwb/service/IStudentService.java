package com.rui.fwb.service;

import com.rui.fwb.vo.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IStudentService {
    @Transactional(readOnly = true)
    public List<Student> list();
    public void Insert(String name,String passwd,Integer cla,String realName);
    public Student findByName(String name);
}
