package com.example.service.impl;

import com.example.entity.Teacher;
import com.example.mapper.TeacherMapper;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> select2() {
        return teacherMapper.selectAll();
    }
}
