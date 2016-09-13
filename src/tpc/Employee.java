/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc;

import java.util.logging.Logger;

/**
 * A class to record employee objects
 * 
 * @author ngsm
 */
abstract public class Employee {
    
    // instance variables
    protected int empNum; // subclasses can use
    protected String name;
    
    private static int nextEmpNo = 1000;
    
    public Employee()
    {
	this.name = "unknown";
	this.empNum = nextEmpNo++;
    }

    public Employee(String name) {
        this.name = name;
        this.empNum = nextEmpNo++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNum() {
        return empNum;
    }
    
    public String toString()
    {
        return name + " with Employee number :" + empNum;
    }
     
    
}
