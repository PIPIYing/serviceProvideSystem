package com.ying.www.service_provide.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ying.www.service_provide.module.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}