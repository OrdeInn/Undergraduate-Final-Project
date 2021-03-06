package com.thesis.Operational.Workflow.Management.and.Automation.System.repositories;

import com.thesis.Operational.Workflow.Management.and.Automation.System.models.ERole;
import com.thesis.Operational.Workflow.Management.and.Automation.System.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@Repository
@RepositoryRestResource(exported = false)
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
