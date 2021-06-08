package com.ying.www.service_provide.module.dto;

import com.ying.www.service_provide.module.Contract;
import lombok.Getter;
import lombok.Setter;

public class ContractQueryDTO {

    @Getter
    @Setter
    private Contract contract;

    @Getter
    @Setter
    private int size = 10;

    @Getter
    @Setter
    private int current = 1;
}
