package com.lemgui.service;

import com.lemgui.entities.DetailsBureau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailsBureauRepository extends JpaRepository<DetailsBureau,Long> {
}
