package com.ying.www.service_provide.scenario;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.User;
import com.ying.www.service_provide.module.dto.UserLoginDTO;
import com.ying.www.service_provide.module.dto.UserQueryDTO;
import com.ying.www.service_provide.result.CommonResult;
import com.ying.www.service_provide.service.UserDomainService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/user")
public class UserClient {

    @Resource
    private UserDomainService userDomainService;

    @PostMapping("/login")
    public CommonResult<UserLoginDTO> login(@RequestBody User user) {
        return new CommonResult<UserLoginDTO>().success(userDomainService.login(user));
    }

    @PostMapping("/signUp")
    public CommonResult<Void> signUp(@RequestBody User user) {
        return CommonResult.of(userDomainService.signUp(user));
    }

    @PostMapping("/selectUser")
    public CommonResult<Page<User>> selectUserList(@RequestBody UserQueryDTO userQueryDTO) {
        return new CommonResult<Page<User>>().success(userDomainService.selectUserList(userQueryDTO));
    }
}
