package com.lemgui.service;

import com.lemgui.entities.ActiviteCible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActiviteCibleRepository extends JpaRepository<ActiviteCible,Long> {
}
