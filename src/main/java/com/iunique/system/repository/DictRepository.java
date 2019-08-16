package com.iunique.system.repository;

import com.iunique.system.entity.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DictRepository extends JpaRepository<Dict,Long> {


}
