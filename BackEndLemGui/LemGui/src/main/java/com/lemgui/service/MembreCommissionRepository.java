package com.lemgui.service;

import com.lemgui.entities.MembreCommission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MembreCommissionRepository extends JpaRepository<MembreCommission,Long> {
}
