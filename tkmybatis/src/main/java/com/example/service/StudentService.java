package com.example.service;

import com.example.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<Student> select1();


    List<Student> select3();


    List<Student> select6(String sclass, String ssex);

    Integer select7(Student student);

    List<Map<String, Object>> select11();

    List<Map<String, Object>> selectAvgDegreeBySclass(String sclass);

    List<Map<String, Object>> select13();

    List<Map<String, Object>> select14();
}
