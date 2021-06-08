package com.ying.www.service_provide.module.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Chavy
 */
public class UserLoginDTO {

    @Getter
    @Setter
    private Integer userId;

    @Getter
    @Setter
    private String account;

    @Getter
    @Setter
    private Integer roleId;
}
