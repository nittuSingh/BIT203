/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture1;

import java.util.*; 
public class DigiCom
{
  public static void main(String[] args)
  {
   // hourly rate is a constant 12.50
     final double overtimeRate = 1.5;
     final int normalHours = 40;
     
      double hourlyRate;		// variable: hourlyRate literal: 12.50
      
      int hoursWorked;
        
    	// Read hours worked from user
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Enter the hourly rate :");
        hourlyRate = sc.nextDouble();
    	System.out.print("Enter the hours worked : ");
    	hoursWorked = sc.nextInt();
        double weeklyWage;
        int extraHours = hoursWorked - normalHours;
        if (extraHours <= 0)
        {
            weeklyWage = hourlyRate * hoursWorked;
        }
        else
        {
            double overTimePay = extraHours * hourlyRate * overtimeRate;
            weeklyWage = normalHours * hourlyRate + overTimePay;
        }
        
	System.out.println("the weekly wage is " + weeklyWage);
  }
}