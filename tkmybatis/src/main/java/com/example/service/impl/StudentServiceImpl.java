package com.example.service.impl;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> select1() {
        return studentMapper.select1();
    }

    @Override
    public List<Student> select3() {
        return studentMapper.selectAll();
    }

    @Override
    public List<Student> select6(String sclass, String ssex) {
        return studentMapper.select6(sclass,ssex);
    }

    @Override
    public Integer select7(Student student) {
        return studentMapper.selectCount(student);
    }

    @Override
    public List<Map<String, Object>> select11() {
        return studentMapper.select11();
    }

    @Override
    public List<Map<String, Object>> selectAvgDegreeBySclass(String sclass) {
        return studentMapper.selectAvgDegreeBySclass(sclass);
    }

    @Override
    public List<Map<String, Object>> select13() {
        return studentMapper.select13();
    }

    @Override
    public List<Map<String, Object>> select14() {
        return studentMapper.select14();
    }
}
