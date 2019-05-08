package com.lemgui.service;

import com.lemgui.entities.ActiviteDomaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActiviteDomaineRepository extends JpaRepository<ActiviteDomaine,Long> {
}
