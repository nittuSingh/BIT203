
package tpc;
import java.util.*;
/**
 *A class to represent <code>TPC</code> 
 * controller. TPC has an array of Project objects and
 * a counter to count the number of current projects.
 * TPC has a collection of EMployees
 * @author ngsm
 */
public class TPC {
    
    // TPC has a collection of Projects
    private int numberOfProjects;
    private Project[] TPCProjects;
    private final int MAX = 50;
    
    // TPC has a collection of Employees
    private ArrayList<Employee> TPCEmployees;
    
    
    /**
     * Constructor to initialize array of Projects
    */
    public TPC()
    {
        numberOfProjects =0;
        TPCProjects = new Project[MAX];
        
        TPCEmployees = new ArrayList<>();
    }
    
    /**
     * A method to add a full time employee to the collection of employees
     * @param name the name of the employee
     * @param monthlySalary the monthly salary of the full time employee
     * @return the full time employee object that was created, or null if not successful
     */
    public FullTimeEmployee addFullTimeEmployee(String name, double monthlySalary)
    {
        FullTimeEmployee ft = new FullTimeEmployee(name, monthlySalary);
        if (TPCEmployees.add(ft))   // if successful
            return ft;
        else
            return null;
        
        
    }
    
    /**
     * A method to add a part time employee
     * @param name - the name of the part time employee
     * @param hourlyRate - emount that they are paid hourly
     * @return the part time employee object if successful, null otherwise
     */
    public PartTimeEmployee addPartTimeEmployee(String name, double hourlyRate)
    {
        PartTimeEmployee pt = new PartTimeEmployee(name, hourlyRate);
        if (TPCEmployees.add(pt))
            return pt;
        else
            return null;
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
