package com.dulianbin.springboot.mapper;

import java.util.List;

import com.dulianbin.springboot.common.SuperMapper;
import org.apache.ibatis.annotations.Select;

import com.dulianbin.springboot.entity.User;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

}