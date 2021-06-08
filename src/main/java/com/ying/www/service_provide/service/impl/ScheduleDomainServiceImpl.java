package com.ying.www.service_provide.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.domain.IScheduleDomain;
import com.ying.www.service_provide.module.Schedule;
import com.ying.www.service_provide.service.ScheduleDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScheduleDomainServiceImpl implements ScheduleDomainService {

    @Resource
    private IScheduleDomain scheduleDomain;

    @Override
    public boolean addSchedule(Schedule schedule) {
        return scheduleDomain.addSchedule(schedule);
    }

    @Override
    public boolean deleteSchedule(Integer id) {
        return scheduleDomain.deleteSchedule(id);
    }

    @Override
    public boolean updateSchedule(Schedule schedule) {
        return scheduleDomain.updateSchedule(schedule);
    }

    @Override
    public Page<Schedule> selectSchedule(Integer schedule, int size, int current) {
        return scheduleDomain.selectSchedule(schedule, size, current);
    }
}
