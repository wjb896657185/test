package com.itgaoshu.mapper;

import com.itgaoshu.bean.User;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
/*
* 自动以Mapper接口需要继承自tk.mybatis.mapper.common.Mapper<T>接口
* */
public interface UserMapper extends Mapper<User> {
  /*  @Select("select * from user1")
    public List<User> selectuser();*/
}
