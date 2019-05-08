package com.lemgui.service;

import com.lemgui.entities.Cadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CadreRepository extends JpaRepository<Cadre,Long> {
}
