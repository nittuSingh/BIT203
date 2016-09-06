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
            System.out.println("2. Show All Projects");
            System.out.println("0. Quit");
            System.out.print("\nEnter choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1: addProject(); break;
                case 2: System.out.println(tpc.getAllProjects());break;
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
}
