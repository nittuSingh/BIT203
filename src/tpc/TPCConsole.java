/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc;
import java.util.*;
/**
 *
 * @author ngsm
 */
public class TPCConsole {
    static Scanner sc;
    static TPC tpc;
    
    public static void main(String[] args)
    {
        tpc = new TPC();
        sc = new Scanner(System.in);
        
        System.out.println("Welcome to TPC");
        
        int choice;
        do
        {
            System.out.println("Would you like to:");
            System.out.println("1. Add New Project");
            System.out.println("2. Show Projects");
            System.out.println("3. Add Task to Project");
            System.out.println("4. View Project Tasks");
            System.out.println("0. Quit");
            System.out.print("\nEnter choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1: addProject(); break;
                case 2: findProjects();break;
                case 3: addTask(); break;
                case 4: viewTasks(); break;
                case 0: System.out.println("Goodbye");
                default: System.out.println("Invalid choice");
            }
        } while (choice!=0);
    }
    
    public static void addProject()
    {
        System.out.print("Enter name of project :");
        String projectName = sc.nextLine();
        Project newProj = tpc.addProject(projectName);
        if (newProj!= null)
            System.out.println("New Project created:" + newProj.toString());
        else
            System.out.println("Project not created");
    }
    
    public static void findProjects()
	{
		System.out.println("Enter keyword to search or press enter to list all");
		String wanted = sc.nextLine();
		if (wanted.equals(""))
			System.out.println(tpc.getAllProjects());
		else
			System.out.println(tpc.findProject(wanted));
	}
    
    public static void addTask()
    {
        System.out.print("Enter project number :");
        int wantedProject = sc.nextInt();
        sc.nextLine();
        Project foundProject = tpc.findProject(wantedProject);
        if (foundProject == null)
        {
            System.out.println("No such project");
        }
        else
        {
            System.out.println("Project Found: " + foundProject.toString());
            System.out.print("Enter Task description :");
            String description = sc.nextLine();
            System.out.println("Enter Estimated hours :");
            int estHours = sc.nextInt();
            sc.nextLine();
            Task t = foundProject.addTask(description, estHours);
            System.out.println("Task created:" + t.toString());
        }
        
    }
	
    public static void viewTasks()
    {
        System.out.print("Enter project number :");
        int wantedProject = sc.nextInt();
        sc.nextLine();
        Project foundProject = tpc.findProject(wantedProject);
        if (foundProject == null)
        {
            System.out.println("No such project");
        }
        else
        {
            System.out.println("Project Found: " + foundProject.toString());
            System.out.println(foundProject.allTasks());
        }
    }
}


