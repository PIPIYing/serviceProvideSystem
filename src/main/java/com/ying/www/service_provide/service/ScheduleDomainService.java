package com.ying.www.service_provide.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Schedule;

public interface ScheduleDomainService {

    boolean addSchedule(Schedule schedule);

    boolean deleteSchedule(Integer id);

    boolean updateSchedule(Schedule schedule);

    Page<Schedule> selectSchedule(Integer schedule, int size ,int current);
}
