package com.lemgui.service;

import com.lemgui.entities.DetailsResActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailsResActiviteRepository extends JpaRepository<DetailsResActivite,Long> {
}
