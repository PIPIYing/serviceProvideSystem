package com.ying.www.service_provide.scenario;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Contract;
import com.ying.www.service_provide.module.dto.ContractQueryDTO;
import com.ying.www.service_provide.result.CommonResult;
import com.ying.www.service_provide.service.ContractService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/contract")
public class ContractClient {

    @Resource
    private ContractService contractService;

    @PostMapping("/signContract")
    public CommonResult<Void> sign(@RequestBody Contract contract) {
        return CommonResult.of(contractService.sign(contract));
    }

    @PostMapping("/selectContract")
    public CommonResult<Page<Contract>> select(@RequestBody ContractQueryDTO contractQueryDTO) {
        return new CommonResult<Page<Contract>>().success(contractService.selectContract(contractQueryDTO.getContract(),
                contractQueryDTO.getSize(), contractQueryDTO.getCurrent()));
    }
}
