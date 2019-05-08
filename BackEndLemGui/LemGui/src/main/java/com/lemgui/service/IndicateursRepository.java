package com.lemgui.service;

import com.lemgui.entities.Indicateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IndicateursRepository extends JpaRepository<Indicateurs,Long> {
}
