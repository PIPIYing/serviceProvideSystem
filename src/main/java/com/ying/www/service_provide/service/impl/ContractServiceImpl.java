package com.ying.www.service_provide.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.domain.IContractDomain;
import com.ying.www.service_provide.module.Contract;
import com.ying.www.service_provide.service.ContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContractServiceImpl implements ContractService {

    @Resource
    private IContractDomain contractDomain;

    @Override
    public boolean sign(Contract contract) {
        return contractDomain.addContract(contract);
    }

    @Override
    public Page<Contract> selectContract(Contract contract, int size, int current) {
        return contractDomain.selectContract(contract, size, current);
    }
}
