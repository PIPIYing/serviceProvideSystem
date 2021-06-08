package com.ying.www.service_provide.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.module.Project;
import com.ying.www.service_provide.module.context.ProjectRequestContext;

public interface IProjectDomain {

    boolean addProject(ProjectRequestContext projectRequestContext);

    boolean deleteProject(ProjectRequestContext projectRequestContext);

    boolean updateProject(ProjectRequestContext projectRequestContext);

    Page<Project> selectProject(ProjectRequestContext projectRequestContext);
}
