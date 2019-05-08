package com.lemgui.service;

import com.lemgui.entities.DetailsProgramme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailsProgrammeRepository extends JpaRepository<DetailsProgramme,Long> {
}
