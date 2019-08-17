package com.iunique.system.entity;

import com.iunique.base.BaseApplicationTests;
import com.iunique.system.mapper.UserMapper;
import com.iunique.system.repository.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDB extends BaseApplicationTests {

    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    DictRepository dictRepository;
    @Autowired
    LogRepository logRepository;
    @Autowired
    PermissionDataRuleRepository permissionDataRuleRepository;
    @Autowired
    PermissionRepository permissionRepository;
    @Autowired
    RolePermissionRepository rolePermissionRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserDepartRepository userDepartRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test1() {
        Department department = new Department();
        Dict dict = new Dict();
        Log log = new Log();
        Permission permission = new Permission();
        PermissionDataRule permissionDataRule = new PermissionDataRule();
        Role role = new Role();
        RolePermission rolePermission = new RolePermission();
        User user = new User();
        UserDepart userDepart = new UserDepart();
        UserRole userRole = new UserRole();




        department.setId((long) 1);
        dict.setId((long) 1);
        log.setId((long) 1);
        permission.setId((long) 1);
        permissionDataRule.setId((long) 1);
        role.setId((long) 1);
        rolePermission.setId((long) 1);
        user.setId((long) 1);
        userDepart.setId((long) 1);
        userRole.setId((long) 1);


        departmentRepository.save(department);
        dictRepository.save(dict);
        logRepository.save(log);
        permissionDataRuleRepository.save(permissionDataRule);
        permissionRepository.save(permission);
        rolePermissionRepository.save(rolePermission);
        roleRepository.save(role);
        userDepartRepository.save(userDepart);
        userRepository.save(user);
        userRoleRepository.save(userRole);


    }


    @Test
    public void testMapper() {
        User user = userMapper.selectById(1);
        System.out.println(user);

    }
}
