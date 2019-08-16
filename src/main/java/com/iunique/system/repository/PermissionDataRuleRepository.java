package com.iunique.system.repository;

import com.iunique.system.entity.PermissionDataRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissionDataRuleRepository extends JpaRepository<PermissionDataRule,Long> {


}
