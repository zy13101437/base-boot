package com.iunique.system.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QueryWrapperUtils {


    public static <T> QueryWrapper<T> create(T t) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>(t);
//        queryWrapper.lambda().
//        queryWrapper.
        return queryWrapper;
    }
}
