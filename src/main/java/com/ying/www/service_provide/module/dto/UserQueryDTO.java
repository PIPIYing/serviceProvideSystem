package com.ying.www.service_provide.module.dto;

import com.ying.www.service_provide.module.User;
import lombok.Getter;
import lombok.Setter;

public class UserQueryDTO {

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private int current = 1;

    @Getter
    @Setter
    private int size = 10;
}
