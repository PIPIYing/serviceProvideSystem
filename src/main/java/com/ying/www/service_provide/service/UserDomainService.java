package com.ying.www.service_provide.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.User;
import com.ying.www.service_provide.module.dto.UserLoginDTO;
import com.ying.www.service_provide.module.dto.UserQueryDTO;

public interface UserDomainService {

    UserLoginDTO login(User user);

    boolean signUp(User user);

    Page<User> selectUserList(UserQueryDTO userQueryDTO);
}
