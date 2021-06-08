package com.ying.www.service_provide.domain.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.dao.ProjectMapper;
import com.ying.www.service_provide.domain.IProjectDomain;
import com.ying.www.service_provide.module.Project;
import com.ying.www.service_provide.module.context.ProjectRequestContext;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ProjectDomain implements IProjectDomain {

    private ProjectMapper projectMapper;

    @Override
    public boolean addProject(ProjectRequestContext projectRequestContext) {
        return projectMapper.insert(projectRequestContext.getProject()) == 1;
    }

    @Override
    public boolean deleteProject(ProjectRequestContext projectRequestContext) {
        return projectMapper.deleteById(projectRequestContext.getProjectId()) == 1;
    }

    @Override
    public boolean updateProject(ProjectRequestContext projectRequestContext) {
        return projectMapper.updateById(projectRequestContext.getProject()) == 1;
    }

    @Override
    public Page<Project> selectProject(ProjectRequestContext projectRequestContext) {
        Page<Project> projectPage = new Page<>(projectRequestContext.getCurrent(), projectRequestContext.getSize());
        QueryWrapper<Project> queryWrapper = new QueryWrapper<>();
        Project project = projectRequestContext.getProject();
        if (project != null) {
            queryWrapper.lambda()
                    .like(Strings.isNotEmpty(project.getProjectName()), Project::getProjectName, project.getProjectName())
                    .eq(project.getStatus() != null, Project::getStatus, project.getStatus());
        }
        return projectMapper.selectPage(projectPage, queryWrapper);
    }
}
