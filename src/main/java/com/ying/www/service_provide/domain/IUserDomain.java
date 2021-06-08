package com.ying.www.service_provide.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.User;
import com.ying.www.service_provide.module.context.UserRequestContext;


/**
 * @author Chavy
 */
public interface IUserDomain {

    boolean addUser(UserRequestContext requestContext);

    boolean deleteUser(UserRequestContext requestContext);

    boolean updateUser(UserRequestContext requestContext);

    Page<User> selectUserList(UserRequestContext requestContext);

    User selectUser(UserRequestContext requestContext);
}
