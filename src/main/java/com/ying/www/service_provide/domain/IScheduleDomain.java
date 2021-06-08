package com.ying.www.service_provide.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Schedule;

public interface IScheduleDomain {

    boolean addSchedule(Schedule schedule);

    boolean deleteSchedule(Integer id);

    boolean updateSchedule(Schedule schedule);

    Page<Schedule> selectSchedule(Integer userId, int size, int current);
}
