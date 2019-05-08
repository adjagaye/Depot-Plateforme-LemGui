package com.lemgui.service;

import com.lemgui.entities.TypeActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeActiviteRepository  extends JpaRepository<TypeActivite,Long> {
}
