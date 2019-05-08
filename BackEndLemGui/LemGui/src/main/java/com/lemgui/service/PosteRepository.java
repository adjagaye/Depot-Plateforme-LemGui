package com.lemgui.service;

import com.lemgui.entities.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PosteRepository extends JpaRepository<Poste,Long> {
}
