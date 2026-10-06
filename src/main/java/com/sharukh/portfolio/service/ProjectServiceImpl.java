package com.sharukh.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sharukh.portfolio.entity.Project;
import com.sharukh.portfolio.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @Override
    public Project updateProject(Long id, Project project) {

        Project existingProject = getProjectById(id);

        existingProject.setTitle(project.getTitle());
        existingProject.setDescription(project.getDescription());
        existingProject.setTechnologies(project.getTechnologies());
        existingProject.setGithubUrl(project.getGithubUrl());
        existingProject.setLiveUrl(project.getLiveUrl());

        return projectRepository.save(existingProject);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}