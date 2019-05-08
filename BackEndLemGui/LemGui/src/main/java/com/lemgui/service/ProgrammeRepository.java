package com.lemgui.service;

import com.lemgui.entities.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProgrammeRepository extends JpaRepository<Programme,Long> {
}
