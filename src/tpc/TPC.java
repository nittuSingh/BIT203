
package tpc;

/**
 *A class to represent <code>TPC</code> 
 * controller. TPC has an array of Project objects and
 * a counter to count the number of current projects.

 * @author ngsm
 */
public class TPC {
    
    private int numberOfProjects;
    private Project[] TPCProjects;
    private final int MAX = 50;
    
    /**
     * Constructor to initialize array of Projects
    */
    public TPC()
    {
        numberOfProjects =0;
        TPCProjects = new Project[MAX];
        
    }
    
    /** 
     * A method to create and add a project to the array of projects
     * @param projectName
     * @return Project
     */
    public Project addProject(String projectName)
    {
        Project p = null;
        if (numberOfProjects < MAX) 
        {   // still enough space in array
            p = new Project(projectName);
            TPCProjects[numberOfProjects++] = p;
        }
        return p;
    }
    
    public String getAllProjects()
    {
        String all = "All Projects\nNo\tName\n";
        for (int i = 0; i<numberOfProjects; i++)
        {
            Project p = TPCProjects[i];
            all += p.getProjectNum() + "\t" + p.getProjectName() +"\n";
        }
         return all;
    }
    
    /** a method to find a project given the project num
     * 
     */
    public Project findProject(int projectNo)
    {
        for (int i = 0 ; i < numberOfProjects; i++)
        {
            if (TPCProjects[i].getProjectNum()==projectNo)
                return TPCProjects[i];
        }
        return null;
    }
    
    /** 
     * return a String containing all projects with the keyword
     *
     */
    public String findProject(String searchString)
    {
        String foundProjects = "Found: \n";
         for (int i = 0; i<numberOfProjects; i++)
        {
            Project p = TPCProjects[i];
            if (p.getProjectName().contains(searchString))
            foundProjects += p.toString()+"\n";
        }
         return foundProjects;
    }
}
