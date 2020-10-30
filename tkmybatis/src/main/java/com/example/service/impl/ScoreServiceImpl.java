package com.example.service.impl;

import com.example.entity.Score;
import com.example.mapper.ScoreMapper;
import com.example.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> select4(String a, String b) {
        return scoreMapper.select4(a,b);
    }

    @Override
    public List<Score> select5() {
        return scoreMapper.select5();
    }

    @Override
    public Score selectMaxScore() {
        return scoreMapper.selectMaxScore();
    }

    @Override
    public List<Map<String ,Object>>selectAvgDegree() {
        return scoreMapper.selectAvgDegree();
    }

    @Override
    public List<Map<String, Object>> selectAvgDegreeSelective(String a, String b) {
        return scoreMapper.selectAvgDegreeSelective(a,b);
    }

    @Override
    public List<Map<String, Object>> select15(String degree, String cno) {
        return scoreMapper.select15(degree,cno);
    }

    @Override
    public List<Map<String, Object>> select16() {
        return scoreMapper.select16();
    }
}
















