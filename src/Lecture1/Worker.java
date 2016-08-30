/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture1;

/**
 * A class to represent a worker. 
 * @author ngsm
 */
public class Worker {
    
    // attributes
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    
    // constructor
    public Worker()
    {
        name = "unknown";
        hourlyRate = 0.0;
        hoursWorked = 0;
    }
    
    public Worker(String inName, double inRate, int inHours)
    {
        name = inName;
        hourlyRate = inRate;
        hoursWorked = inHours;
    }
    
    // getters
    public String getName()
    {
        return name;
    }
    
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    
    // setters
    public void setName(String inName)
    {
        name = inName;
    }
    
    public void setHourlyRate(double inHourlyRate)
    {
        hourlyRate = inHourlyRate;
    }
    
    public void setHoursWorked(int inHoursWorked)
    {
        hoursWorked = inHoursWorked;
    }
    
    public String toString()
    {
        return "Worker name: " + name + " is paid " + hourlyRate + "per hour and worked " + hoursWorked + " this week";
    }
}
