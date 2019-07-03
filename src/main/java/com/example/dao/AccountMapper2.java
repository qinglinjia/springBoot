package com.example.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by jiaql on 2019/7/2.
 */
public interface AccountMapper2 {
    int update(@Param("money") double money,@Param("id") int id);
}
