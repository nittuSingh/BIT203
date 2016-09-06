
package tpc;

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
    
    private static int nextProjectNo = 0;
    
    public Project()
    {
        this.projectName = "unknown";
        this.projectNum = nextProjectNo++;
    }
    
    public Project(String projectName)
    {
        this.projectName = projectName;
        this.projectNum = nextProjectNo++;
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
    
    public String toString()
    {
        return "Project : " + projectNum + " codename: " + projectName;
    }
}
