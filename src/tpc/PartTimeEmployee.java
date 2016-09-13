/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc;

/**
 * A Part Time Employee is a subclass of Employee
 * @author ngsm
 */
public class PartTimeEmployee extends Employee{
    
    // attributes
    private double hourlyRate;
    
    /** 
     * No args constructor
     */
    public PartTimeEmployee()
    {
        super();
        hourlyRate = 0.0;
    }
    
    /**
     * Constructor with arguments
     * @param name Name of the employee
     * @param hourlyRate must be non-negative
     */
    public PartTimeEmployee(String name, double hourlyRate)
    {
        super(name);
        if (hourlyRate > 0)
            this.hourlyRate = hourlyRate;
        else
            this.hourlyRate = 0.0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

  
    
    public String toString()
    {
        return "Part Time:" + name + " with employee number " + empNum + " and hourly rate of " + hourlyRate;
    }
}
