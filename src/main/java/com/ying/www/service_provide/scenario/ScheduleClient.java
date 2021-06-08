package com.ying.www.service_provide.scenario;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Schedule;
import com.ying.www.service_provide.result.CommonResult;
import com.ying.www.service_provide.service.ScheduleDomainService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController("/schedule")
public class ScheduleClient {

    @Resource
    private ScheduleDomainService scheduleDomainService;

    @PostMapping("/addSchedule")
    public CommonResult<Void> add(@RequestBody Schedule schedule) {
        return CommonResult.of(scheduleDomainService.addSchedule(schedule));
    }

    @PostMapping("/updateSchedule")
    public CommonResult<Void> update(@RequestBody Schedule schedule) {
        return CommonResult.of(scheduleDomainService.updateSchedule(schedule));
    }

    @GetMapping("/deleteSchedule")
    public CommonResult<Void> delete(@RequestParam("id") Integer id) {
        return CommonResult.of(scheduleDomainService.deleteSchedule(id));
    }

    @GetMapping("/selectSchedule")
    public CommonResult<Page<Schedule>> select(@RequestParam("id") Integer id,
                                               @RequestParam(value = "size", defaultValue = "10") int size,
                                               @RequestParam(value = "current", defaultValue = "1") int current) {
        return new CommonResult<Page<Schedule>>().success(scheduleDomainService.selectSchedule(id, size, current));
    }
}
