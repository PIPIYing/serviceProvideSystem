package com.ying.www.service_provide.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Contract;

public interface ContractService {

    boolean sign(Contract contract);

    Page<Contract> selectContract(Contract contract, int size, int current);
}
