package com.lemgui.service;

import com.lemgui.entities.Cible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CibleRepository extends JpaRepository<Cible, Long> {
}
