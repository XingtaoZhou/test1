package com.example.service;

import com.example.entity.SbSubCycleParam;

import java.util.List;

public interface SbSubCycleParamService {
    List<SbSubCycleParam> queryOne(String legalPersonCode);



    List<SbSubCycleParam> queryByExample(Short cardType,Short subFor,Integer walletNo);

    void insertOne(SbSubCycleParam sbSubCycleParam);

    void updateOne(SbSubCycleParam sbSubCycleParam);
}
