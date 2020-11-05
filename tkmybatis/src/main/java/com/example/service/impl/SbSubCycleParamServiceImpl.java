package com.example.service.impl;

import com.example.entity.SbSubCycleParam;
import com.example.mapper.SbSubCycleParamMapper;
import com.example.service.SbSubCycleParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SbSubCycleParamServiceImpl implements SbSubCycleParamService {

    @Autowired
    private SbSubCycleParamMapper sbSubCycleParamMapper;

    @Override
    public List<SbSubCycleParam> queryOne(String legalPersonCode) {
        SbSubCycleParam sbSubCycleParam = new SbSubCycleParam();
        sbSubCycleParam.setLegalPersonCode(legalPersonCode);
        return sbSubCycleParamMapper.select(sbSubCycleParam);
    }

    @Override
    public List<SbSubCycleParam> queryByExample(Short cardType,Short subFor,Integer walletNo) {

        return sbSubCycleParamMapper.queryByExample(cardType,subFor,walletNo);
    }

    @Override
    public void insertOne(SbSubCycleParam sbSubCycleParam) {
        sbSubCycleParamMapper.insert(sbSubCycleParam);
    }

    @Override
    public void updateOne(SbSubCycleParam sbSubCycleParam) {
        sbSubCycleParamMapper.updateOne(sbSubCycleParam);
    }


}



















