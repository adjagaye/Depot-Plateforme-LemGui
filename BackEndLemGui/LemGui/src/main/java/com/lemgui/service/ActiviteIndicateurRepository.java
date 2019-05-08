package com.lemgui.service;

import com.lemgui.entities.ActiveIndicateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ActiviteIndicateurRepository extends JpaRepository<ActiveIndicateur,Long> {
}
