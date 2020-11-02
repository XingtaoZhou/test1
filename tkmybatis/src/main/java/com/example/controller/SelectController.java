package com.example.controller;

import com.example.entity.Score;
import com.example.entity.Student;
import com.example.entity.Teacher;
import com.example.service.CourseService;
import com.example.service.ScoreService;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SelectController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ScoreService scoreService;

    @ResponseBody
    @RequestMapping("/select1")
    public List<Student> select1(){
        return studentService.select1();
    }

    @ResponseBody
    @RequestMapping("/select2")
    public List<Teacher> select2(){
        return teacherService.select2();
    }

    @ResponseBody
    @RequestMapping("/select3")
    public List<Student> select3(){
        return studentService.select3();
    }

    @ResponseBody
    @RequestMapping("/select4")
    public List<Score> select4(String a, String b){
        return scoreService.select4(a,b);
    }

    @ResponseBody
    @RequestMapping("/select5")
    public List<Score> select5(){
        return scoreService.select5();
    }

    @ResponseBody
    @RequestMapping("/select6")
    public List<Student> select6(String sclass, String ssex){
        return studentService.select6(sclass,ssex);
    }

    @ResponseBody
    @RequestMapping("/select7")
    public Integer select7(String sclass){
        Student student = new Student();
        student.setSclass(sclass);
        return studentService.select7(student);
    }

    @ResponseBody
    @RequestMapping("/select8")
    public Map<String ,Object> select8(){
        Score maxScore = scoreService.selectMaxScore();
        Map<String,Object> map = new HashMap<>();
        map.put("sno",maxScore.getSno());
        map.put("cno",maxScore.getCno());
        return map;
    }

    @ResponseBody
    @RequestMapping("/select9")
    public List<Map<String ,Object>> select9(){
        return scoreService.selectAvgDegree();
    }


    @ResponseBody
    @RequestMapping("/select10")
    public List<Map<String ,Object>> select10(String a, String b){
        return scoreService.selectAvgDegreeSelective(a,b);
    }

    @ResponseBody
    @RequestMapping("/select11")
    public List<Map<String ,Object>> select11(){
        return studentService.select11();
    }

    @ResponseBody
    @RequestMapping("/select12")
    public List<Map<String ,Object>> select12(String sclass){
        return studentService.selectAvgDegreeBySclass(sclass);
    }

    @ResponseBody
    @RequestMapping("/select13")
    public List<Map<String ,Object>> select13(){
        return studentService.select13();
    }

    @ResponseBody
    @RequestMapping("/select14")
    public List<Map<String ,Object>> select14(){
        return studentService.select14();
    }

    @ResponseBody
    @RequestMapping("/select15")
    public List<Map<String ,Object>> select15(Score score){

        return scoreService.select15(String.valueOf(score.getDegree()),score.getCno());
    }


    @ResponseBody
    @RequestMapping("/select16")
    public List<Map<String ,Object>> select16(){

        return scoreService.select16();
    }



}












