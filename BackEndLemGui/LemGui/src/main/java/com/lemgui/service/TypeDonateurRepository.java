package com.lemgui.service;

import com.lemgui.entities.TypeDonateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeDonateurRepository extends JpaRepository<TypeDonateur,Long> {
}
