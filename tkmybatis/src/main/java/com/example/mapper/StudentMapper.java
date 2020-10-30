package com.example.mapper;

import com.example.entity.Student;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface StudentMapper extends Mapper<Student> {
    List<Student> select1();

    List<Student> select6(String sclass, String ssex);

    List<Map<String, Object>> select11();

    List<Map<String, Object>> selectAvgDegreeBySclass(String sclass);

    List<Map<String, Object>> select13();

    List<Map<String, Object>> select14();
}