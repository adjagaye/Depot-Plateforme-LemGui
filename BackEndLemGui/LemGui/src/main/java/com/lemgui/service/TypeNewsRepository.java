package com.lemgui.service;

import com.lemgui.entities.TypeNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeNewsRepository extends JpaRepository<TypeNews,Long> {
}
