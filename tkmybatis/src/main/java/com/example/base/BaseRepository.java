package com.example.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseRepository<T> extends Mapper<T> , MySqlMapper<T> {



}
