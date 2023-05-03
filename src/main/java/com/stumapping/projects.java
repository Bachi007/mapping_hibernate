package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class projects {

	@Id
	private int projectId;
	private String projectName;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "projects [projectId=" + projectId + ", projectName=" + projectName + "]";
	}
	
	
}
