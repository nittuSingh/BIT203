/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc;

/**
 * A Full Time Employee is a subclass of Employee
 * @author ngsm
 */
public class FullTimeEmployee extends Employee{
    
    // attributes
    private double monthlySalary;
    
    /** 
     * No args constructor
     */
    public FullTimeEmployee()
    {
        super();
        monthlySalary = 0.0;
    }
    
    /**
     * Constructor with arguments
     * @param name Name of the employee
     * @param monthlySalary must be non-negative
     */
    public FullTimeEmployee(String name, double monthlySalary)
    {
        super(name);
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    public String toString()
    {
        return name + " with employee number " + empNum + " and salary of " + monthlySalary;
    }
}
