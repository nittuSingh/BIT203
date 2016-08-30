/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture1;

import java.util.*;

public class DigiCom {

     final static double overtimeRate = 1.5;
     final static int normalHours = 40;

    public static void main(String[] args) {
        // hourly rate is a constant 12.50
       
        double hourlyRate;		// variable: hourlyRate literal: 12.50

        int hoursWorked;

        // Read hours worked from user
        Scanner sc = new Scanner(System.in);
        double totalWages = 0;
        // Read info for five workers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of worker :");
            String name = sc.nextLine();
            System.out.print("Enter the hourly rate :");
            hourlyRate = sc.nextDouble();
            System.out.print("Enter the hours worked : ");
            hoursWorked = sc.nextInt();
            sc.nextLine();  // consume the newline for the int
            
            double weeklyWage = calcWage(hourlyRate, hoursWorked);
            totalWages += weeklyWage;
            printInfo(name, weeklyWage);
           }   // end of for loop

        System.out.printf("The total wages paid is $%5.2f\n", totalWages);
    }

    // a method to calculate the weekly wage
    public static double calcWage(double rate, int hours) {
        double weeklyWage;
        int extraHours = hours - normalHours;
        if (extraHours <= 0) {
            weeklyWage = rate * hours;
        } else {
            double overTimePay = extraHours * rate * overtimeRate;
            weeklyWage = normalHours * rate + overTimePay;
        }
        return weeklyWage;
    }
    
    // a method to print out the info about the worker
    public static void printInfo(String workerName, double wages)
    {
         System.out.printf("The weekly wage for %s is $%5.2f\n", workerName, wages);
      
    }
}
