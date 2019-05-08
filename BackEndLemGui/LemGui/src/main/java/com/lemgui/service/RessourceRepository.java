package com.lemgui.service;

import com.lemgui.entities.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RessourceRepository extends JpaRepository<Ressource,Long> {
}
