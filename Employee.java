/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_07.employee_main;

/**
 *
 * @author pinkp
 */
public class Employee {
    private String name;
    private double salary;
    
public Employee(String name,double salary ){
this.name = name;
this.salary = salary;
}    


    
  public void displayinfo(){
  System.out.println("Employee Name: " + name);
  System.out.println("Employee Salary: " + salary);
    }
  
}


