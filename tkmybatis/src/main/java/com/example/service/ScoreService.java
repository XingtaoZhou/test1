package com.example.service;

import com.example.entity.Score;

import java.util.List;
import java.util.Map;

public interface ScoreService {
    List<Score> select4(String a, String b);

    List<Score> select5();

    Score selectMaxScore();

    List<Map<String ,Object>> selectAvgDegree();

    List<Map<String, Object>> selectAvgDegreeSelective(String a, String b);

    List<Map<String, Object>> select15(String degree, String cno);

    List<Map<String, Object>> select16();

}
