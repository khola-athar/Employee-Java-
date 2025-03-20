/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop_lab_07.employee_main;

/**
 *
 * @author pinkp
 */
public class Employee_Main {

    public static void main(String[] args) {
     //Employee class details 
      System.out.println("Employee: ");  
      Employee employee = new Employee("Sara Ali", 65000.0);
        employee.displayinfo();
        System.out.println();

        //Manager class details
     System.out.println("Manager: ");    
    Manager manager = new Manager("Zainab", 98000,"Cyber Security");
    manager.DisplayDep();
    }
}
