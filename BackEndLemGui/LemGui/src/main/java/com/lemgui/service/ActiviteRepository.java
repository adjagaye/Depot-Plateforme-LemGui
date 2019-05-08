package com.lemgui.service;

import com.lemgui.entities.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActiviteRepository extends JpaRepository<Activite,Long> {
}
