/**
 * EmployeeTest.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

package runoob.ObjAndClass;

public class EmployeeTest {
  public static void main(String[] args) {
    // create two objs with constructor
    Employee empOne = new Employee("JL");
    Employee empTwo = new Employee("QCL");
    // call objs with method
    empOne.empAge(29);
    empOne.empDesignation("Advanced");
    empOne.empSalary(7000);
    empOne.printEmployee();

    empTwo.empAge(29);
    empTwo.empDesignation("Beginner");
    empTwo.empSalary(3000);
    empTwo.printEmployee();
  }
}

class Employee {
  /* Member var: inside the class, outside of the method, instantiated when 
  creating the obj, can be accessed by class method, constructor and specific
  block. */
  String name;
  String designation;
  int age;
  double salary;
  /* Class var: inside the class, outside of the method, must use keyword static 
  part of the whole class, can be called by method, constructor, and specific
  block. */ 
  static int classVariable;

  // Employee class constructor
  public Employee(String name) {
    /* local var has a preferential order to member var when they have the same
    name. Use this if need to access the member var inside the method. */
    this.name = name;
  }
  // Set value of age
  public void empAge(int empAge) {
    /* local var: declared and initialized inside method, gone as method ends */
    int localVariable = 0;
    age = localVariable;
    age = empAge;
  }
  // Set designation value
  public void empDesignation(String empDesignation) {
    designation = empDesignation;
  }
  // Set salary value
  public void empSalary(double empSalary) {
    salary = empSalary;
  }
  // Output message
  public void printEmployee() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }
}
