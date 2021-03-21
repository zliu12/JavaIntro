/**
 * For Test Purpose
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class Test {
  private static int staticVariable = 0;
  private int nonStaticVariable = 0;

  // Non static method
  public void nonStaticMethod() {

    // non static variable, ok
    nonStaticVariable++;
    
    // static variable, error shown, description on the right
    staticVariable++;       
  }

  // Static method
  public static void staticMethod() {

    // Cannot make a static reference to the non-static field
    nonStaticVariable--;

    // static variable, ok
    staticVariable--;     
  }
}