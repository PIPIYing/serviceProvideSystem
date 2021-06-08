package com.ying.www.service_provide.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Contract;

public interface IContractDomain {

    boolean addContract(Contract contract);

    Page<Contract> selectContract(Contract contract, int size, int current);
}
