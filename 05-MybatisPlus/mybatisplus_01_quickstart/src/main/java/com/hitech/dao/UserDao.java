package com.hitech.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hitech.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
