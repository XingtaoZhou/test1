package com.example.mapper;

import com.example.entity.SbSubCycleParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SbSubCycleParamMapper extends Mapper<SbSubCycleParam> {
    List<SbSubCycleParam> queryByExample(Short cardType,Short subFor,Integer walletNo);

    void updateOne(SbSubCycleParam sbSubCycleParam);
}