package com.ying.www.service_provide.domain.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.dao.UserMapper;
import com.ying.www.service_provide.domain.IUserDomain;
import com.ying.www.service_provide.module.User;
import com.ying.www.service_provide.module.context.UserRequestContext;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author Chavy
 */
@Component
public class UserDomain implements IUserDomain {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean addUser(UserRequestContext requestContext) {
        Assert.notNull(requestContext.getUser(), "用户信息不能为空");
        Assert.state(userMapper.insert(requestContext.getUser()) == 1, "SYSTEM_ERROR");
        return true;
    }

    @Override
    public boolean deleteUser(UserRequestContext requestContext) {
        Assert.notNull(requestContext.getUserId(), "用户id不能为空");
        Assert.state(userMapper.deleteById(requestContext.getUserId()) == 1, "SYSTEM_ERROR");
        return true;
    }

    @Override
    public boolean updateUser(UserRequestContext requestContext) {
        Assert.notNull(requestContext.getUser(), "用户信息不能为空");
        Assert.state(userMapper.updateById(requestContext.getUser()) == 1, "SYSTEM_ERROR");
        return true;
    }

    @Override
    public Page<User> selectUserList(UserRequestContext requestContext) {
        Page<User> page = new Page<>(requestContext.getCurrent(), requestContext.getSize());
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        User user = requestContext.getUser();
        if (user != null) {
            queryWrapper
                    .lambda()
                    .like(StringUtils.isEmpty(user.getAccount()), User::getAccount, user.getAccount())
                    .like(user.getSex() != null, User::getSex, user.getSex())
                    .in(!CollectionUtils.isEmpty(requestContext.getUserIdList()), User::getId, requestContext.getUserIdList());
        }
        return userMapper.selectPage(page, queryWrapper);
    }

    @Override
    public User selectUser(UserRequestContext requestContext) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (requestContext.getUser() == null) {
            return null;
        }
        queryWrapper.lambda()
                .eq(User::getAccount, requestContext.getUser().getAccount())
                .eq(requestContext.getUser().getPassword() != null, User::getPassword,
                        requestContext.getUser().getPassword());
        return userMapper.selectOne(queryWrapper);
    }
}