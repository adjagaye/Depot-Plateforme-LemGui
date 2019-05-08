package com.lemgui.service;

import com.lemgui.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DonateurRepository extends JpaRepository<Donateur,Long> {
}
