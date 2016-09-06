/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc;

/**
 *
 * @author ngsm
 */
public class Task {
    
    private Project theProject;
    private String taskNo;
    private String description;
    private int estHours;
    private int actualHours;
    private String status;
    
    public Task(Project theProject, String description, int estHours)
    {   setTaskNo("P"+theProject.getProjectNum()+'-'+theProject.getNumTasks());
        setProject(theProject);
        setDescription(description);
        setEstHours(estHours);
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstHours() {
        return estHours;
    }

    public void setEstHours(int estHours) {
        if (estHours>= 0)
          this.estHours = estHours;
    }

    public int getActualHours() {
        return actualHours;
    }

    public void setActualHours(int actualHours) {
        this.actualHours = actualHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     public Project getProject() {
        return theProject;
    }

    public void setProject(Project theProject) {
        this.theProject = theProject;
    }
    @Override
    public String toString() {
        return "Task{" + "taskNo=" + taskNo + ", description=" + description + ", estHours=" + estHours + ", actualHours=" + actualHours + ", status=" + status + '}';
    }
    
    
}
