
package tpc;

import java.util.ArrayList;

/**
 * /* A class to represent <code>Project</code>
 * objects. A Project has a projectName and 
 * projectNum @version 1.0 1/7/2012 Modified: 
 * @author ngsm
 */
public class Project {
    
    // attributes
    private String projectName;
    private int projectNum;
    private ArrayList<Task> projectTasks;
    
    private static int nextProjectNo = 0;
    
    public Project()
    {
        this.projectName = "unknown";
        this.projectNum = nextProjectNo++;
        projectTasks = new ArrayList<>();
    }
    
    public Project(String projectName)
    {
        this.projectName = projectName;
        this.projectNum = nextProjectNo++;
        projectTasks = new ArrayList<>();
    }
    
    /*
    A method that returns the number of tasks in this 
    project
    */
    public int getNumTasks()
    {
        return projectTasks.size();
    }
    
    public Task addTask(String description, int estHours)
    {
        Task newTask = new Task(this, description, estHours);
        projectTasks.add(newTask);
        return newTask;
    }
    
    public int getProjectNum()
    {
        return projectNum;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public String allTasks()
    {
        String all = "All Tasks in Project:\n";
        for (Task t:projectTasks)
        {
            all += t.getTaskNo() + "\t" + t.getDescription() +"\n";
        }
        return all;
    }
    public String toString()
    {
        return "Project : " + projectNum + " codename: " + projectName;
    }
}
