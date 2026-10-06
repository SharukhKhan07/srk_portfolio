package com.sharukh.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String technologies;
    private String githubUrl;
    private String liveUrl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public String getGithubUrl() {
		return githubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	public String getLiveUrl() {
		return liveUrl;
	}
	public void setLiveUrl(String liveUrl) {
		this.liveUrl = liveUrl;
	}
	public Project(Long id, String title, String description, String technologies, String githubUrl, String liveUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.technologies = technologies;
		this.githubUrl = githubUrl;
		this.liveUrl = liveUrl;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", description=" + description + ", technologies="
				+ technologies + ", githubUrl=" + githubUrl + ", liveUrl=" + liveUrl + "]";
	}
    
}