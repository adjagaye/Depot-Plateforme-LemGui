package com.lemgui.service;

import com.lemgui.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MembreRepository extends JpaRepository<Membre,Long> {
    Membre findMembreByLogin(String login);
}
