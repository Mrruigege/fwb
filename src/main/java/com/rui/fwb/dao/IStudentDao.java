package com.rui.fwb.dao;

import com.rui.fwb.vo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentDao {
    public List<Student> findAll();
    public void insert(String name,String passwd,Integer cla,String realName);
    public Student findByName(String name);
}
