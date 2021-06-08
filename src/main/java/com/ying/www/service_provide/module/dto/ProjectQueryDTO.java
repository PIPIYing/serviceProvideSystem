package com.ying.www.service_provide.module.dto;

import com.ying.www.service_provide.module.Project;
import lombok.Getter;
import lombok.Setter;

public class ProjectQueryDTO {

    @Getter
    @Setter
    private Project project;

    @Getter
    @Setter
    private int size = 1;

    @Getter
    @Setter
    private int current = 10;
}
