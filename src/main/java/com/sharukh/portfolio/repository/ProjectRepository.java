package com.sharukh.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharukh.portfolio.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}