package com.sharukh.portfolio.service;

import java.util.List;

import com.sharukh.portfolio.entity.Project;

public interface ProjectService {

    Project saveProject(Project project);

    List<Project> getAllProjects();

    Project getProjectById(Long id);

    Project updateProject(Long id, Project project);

    void deleteProject(Long id);
}