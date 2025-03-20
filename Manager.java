/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_07.employee_main;

/**
 *
 * @author pinkp
 */
public class Manager extends Employee {
 private String dep;
 public Manager(String name, double salary, String dep){
 super(name, salary);
 this.dep = dep;
 }
  
public void DisplayDep(){
super.displayinfo();
System.out.println("Department: " + dep);
}

}
