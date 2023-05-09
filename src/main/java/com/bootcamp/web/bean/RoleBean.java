package com.bootcamp.web.bean;

import com.bootcamp.web.entity.EmployeeRole;
import com.bootcamp.web.entity.RoleModule;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class RoleBean {
    private Long id;
    private String role;
    private Set<EmployeeRole> employee = new HashSet<>();
    private Set<RoleModule> module = new HashSet<>();
}
