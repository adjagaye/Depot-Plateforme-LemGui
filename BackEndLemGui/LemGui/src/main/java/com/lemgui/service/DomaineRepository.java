package com.lemgui.service;

import com.lemgui.entities.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DomaineRepository extends JpaRepository<Domaine,Long> {
}
