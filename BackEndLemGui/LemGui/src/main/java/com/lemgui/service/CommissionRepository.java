package com.lemgui.service;

import com.lemgui.entities.Commission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommissionRepository extends JpaRepository<Commission,Long> {
}
