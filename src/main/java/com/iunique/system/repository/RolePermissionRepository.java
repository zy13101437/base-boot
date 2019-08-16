package com.iunique.system.repository;

import com.iunique.system.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission,Long> {


}
