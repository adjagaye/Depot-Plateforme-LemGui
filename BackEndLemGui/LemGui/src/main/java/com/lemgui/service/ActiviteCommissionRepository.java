package com.lemgui.service;

import com.lemgui.entities.ActiviteCommission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActiviteCommissionRepository extends JpaRepository<ActiviteCommission,Long> {

}
