package com.ying.www.service_provide.module.context;

import com.ying.www.service_provide.module.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Chavy
 */
public class UserRequestContext {

    @Setter
    @Getter
    private Integer userId;

    @Setter
    @Getter
    private User user;

    @Setter
    @Getter
    private Integer roleId;

    @Setter
    @Getter
    private int size = 10;

    @Setter
    @Getter
    private int current = 1;

    @Setter
    @Getter
    private List<Integer> userIdList;
}
