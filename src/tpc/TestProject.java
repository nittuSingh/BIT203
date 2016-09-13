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
public class TestProject {
    
    public static void main(String[] args)
    {
        Project p1 = new Project();
        Project p2 = new Project("BIT203 Assign1");
        Project p3 = new Project("BIT203 Assign2");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        Employee e1 = new FullTimeEmployee();
        System.out.println(e1.toString());
    }
}
