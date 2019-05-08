package com.lemgui.service;

import com.lemgui.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRepository extends JpaRepository<News,Long> {
}
