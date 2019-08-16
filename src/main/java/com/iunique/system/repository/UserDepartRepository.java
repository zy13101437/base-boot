package com.iunique.system.repository;

import com.iunique.system.entity.UserDepart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDepartRepository extends JpaRepository<UserDepart,Long> {
}
