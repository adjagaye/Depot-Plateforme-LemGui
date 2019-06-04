package com.lemgui.service;

import com.lemgui.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface ProfilRepository extends JpaRepository<Profil,Long> {
}
