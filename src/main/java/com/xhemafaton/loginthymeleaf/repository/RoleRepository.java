package com.xhemafaton.loginthymeleaf.repository;

import com.xhemafaton.loginthymeleaf.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
