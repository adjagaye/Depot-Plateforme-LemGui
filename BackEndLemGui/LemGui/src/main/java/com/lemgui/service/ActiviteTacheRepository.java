package com.lemgui.service;

import com.lemgui.entities.ActiviteTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActiviteTacheRepository extends JpaRepository<ActiviteTache,Long> {
}
