package com.iunique.system.dto;

import com.iunique.system.entity.*;
import lombok.Data;

import java.io.Serializable;

@Data
public class CollectionDTO implements Serializable {

    private PageDTO pageDTO;
    private User user;
    private Department department;
    private Dict dict;
    private Log log;
    private Permission permission;
    private PermissionDataRule permissionDataRule;
    private Role role;
    private RolePermission rolePermission;
    private UserDepart userDepart;



}
