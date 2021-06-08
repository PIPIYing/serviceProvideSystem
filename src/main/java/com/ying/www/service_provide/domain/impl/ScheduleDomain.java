package com.ying.www.service_provide.domain.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.dao.ScheduleMapper;
import com.ying.www.service_provide.domain.IScheduleDomain;
import com.ying.www.service_provide.module.Schedule;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class ScheduleDomain implements IScheduleDomain {

    @Resource
    private ScheduleMapper scheduleMapper;

    @Override
    public boolean addSchedule(Schedule schedule) {
        return scheduleMapper.insert(schedule) == 1;
    }

    @Override
    public boolean deleteSchedule(Integer id) {
        return scheduleMapper.deleteById(id) == 1;
    }

    @Override
    public boolean updateSchedule(Schedule schedule) {
        return scheduleMapper.updateById(schedule) == 1;
    }

    @Override
    public Page<Schedule> selectSchedule(Integer userId, int size, int current) {
        Page<Schedule> schedulePage = new Page<>(current, size);
        QueryWrapper<Schedule> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Objects.nonNull(userId), Schedule::getUserId, userId);
        return scheduleMapper.selectPage(schedulePage, queryWrapper);
    }
}
