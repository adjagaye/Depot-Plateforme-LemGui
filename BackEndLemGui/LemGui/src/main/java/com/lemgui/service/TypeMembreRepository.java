package com.lemgui.service;

import com.lemgui.entities.TypeMembre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeMembreRepository extends JpaRepository<TypeMembre,Long> {
}
