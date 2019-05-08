package com.lemgui.service;

import com.lemgui.entities.Taches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TachesRepository extends JpaRepository<Taches,Long> {
}
