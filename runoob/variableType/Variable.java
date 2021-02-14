package runoob.variableType;
/**
 * Variable Type.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/* Syntax: type identifier [ = value]
int a, b, c;
int d = 3, e = 4, f = 5;
*/

public class Variable {
  // class var, static, outside of methods
  static int class_var = 0;
  // instanciation var, no static, outside of methods
  String str = "Hello Java";
  public void method() {
    // local variable, inside of class
    int i = 10000;
    System.out.println(i);
  }

  public static void main(String[] args) {
    Variable var = new Variable();
    var.method();
    local_var pup = new local_var();
    pup.pupAge();
  }
}

class local_var {
  public void pupAge() {
    int age = 0;
    age = age + 8;
    System.out.println("Pup age is: " + age);
  }
}

