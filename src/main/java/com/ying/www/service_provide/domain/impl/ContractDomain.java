package com.ying.www.service_provide.domain.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.dao.ContractMapper;
import com.ying.www.service_provide.domain.IContractDomain;
import com.ying.www.service_provide.module.Contract;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ContractDomain implements IContractDomain {

    @Resource
    private ContractMapper contractMapper;

    @Override
    public boolean addContract(Contract contract) {
        return contractMapper.insert(contract) == 1;
    }

    @Override
    public Page<Contract> selectContract(Contract contract, int size, int current) {
        Page<Contract> contractPage = new Page<>(current, size);
        QueryWrapper<Contract> queryWrapper = new QueryWrapper<>();
        if (contract != null) {
            queryWrapper.lambda()
                    .eq(contract.getUserId() != null, Contract::getUserId, contract.getUserId())
                    .eq(contract.getProjectId() != null, Contract::getProjectId, contract.getProjectId());
        }
        return contractMapper.selectPage(contractPage, queryWrapper);
    }
}
