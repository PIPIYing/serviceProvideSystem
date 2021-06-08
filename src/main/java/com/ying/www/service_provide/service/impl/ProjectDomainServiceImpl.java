package com.ying.www.service_provide.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ying.www.service_provide.domain.IProjectDomain;
import com.ying.www.service_provide.module.Project;
import com.ying.www.service_provide.module.context.ProjectRequestContext;
import com.ying.www.service_provide.module.dto.ProjectQueryDTO;
import com.ying.www.service_provide.service.ProjectDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProjectDomainServiceImpl implements ProjectDomainService {

    @Resource
    private IProjectDomain projectDomain;

    @Override
    public boolean addProject(Project project) {
        ProjectRequestContext projectRequestContext = new ProjectRequestContext();
        projectRequestContext.setProject(project);
        return projectDomain.addProject(projectRequestContext);
    }

    @Override
    public boolean updateProject(Project project) {
        ProjectRequestContext projectRequestContext = new ProjectRequestContext();
        projectRequestContext.setProject(project);
        return projectDomain.updateProject(projectRequestContext);
    }

    @Override
    public boolean deleteProject(Integer projectId) {
        ProjectRequestContext projectRequestContext = new ProjectRequestContext();
        projectRequestContext.setProjectId(projectId);
        return projectDomain.deleteProject(projectRequestContext);
    }

    @Override
    public Page<Project> selectProject(ProjectQueryDTO project) {
        ProjectRequestContext projectRequestContext = new ProjectRequestContext();
        projectRequestContext.setProject(project.getProject());
        projectRequestContext.setCurrent(project.getCurrent());
        projectRequestContext.setSize(project.getSize());
        return projectDomain.selectProject(projectRequestContext);
    }
}
