package runoob.variableType;

/**
 * Instantiation Variables.
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class Employee {
  // Accessible by derived class
  public String name;
  // Only accessible by this class
  private double salary;
  // Set name value by using constructor
  public Employee(String empName) {
    name = empName;
  }
  // Set salary value
  public void setSalary(double empSal) {
    salary = empSal;
  }
  // Output
  public void printEmp() {
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
  }
  // class var (static var)
  private static double salary_year;
  public static final String DEPARTMENT = "Intern";
  // Main
  public static void main(String[] args) {
    // Creat an Employee obj
    Employee empOne = new Employee("John");
    empOne.setSalary(4000);
    empOne.printEmp();
    // call call var
    salary_year = 60000;
    System.out.println(DEPARTMENT + " Annual salary: " + salary_year);
  }
}