package MethodsRefresherAreas.src;

/**
 * Methods Refresher Lab - Areas class.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

import java.lang.Math;

/**
 * Methods of calculating the area different different shapes, each method takes
 * in single or multiple arguments.  
 */
public class Areas {
  /**
   * Method calculates the area of a circle.
   * @param radius: length of the circle
   * @param PI: math constant 
   * @return area of a circle
   */
  public static double areaCircle(double radius, final double PI) {
    double circleArea = PI * Math.pow(radius, 2);
    return circleArea;
  }

  /**
   * Method calculates the area of a square.
   * @param length: length of a square's four sides
   * @return area of a square
   */
  public static double areaSquare(double length) {
    double squareArea = Math.pow(length, 2);
    return squareArea;
  }

  /**
   * Method calculates the area of a triangle.
   * @param length: length of a triangle's base
   * @param height: height of a triangle
   * @return area of a triangle
   */
  public static double areaTriangle(double length, double height) {
    double triangleArea = length * height / 2;
    return triangleArea;
  }

  /**
   * Method calculates the area of a rectangle.
   * @param length: length of a rectangle's long side
   * @param width: length of a rectangle's short side
   * @return area of a rectangle
   */
  public static double areaRectangle(double length, double width) {
    double rectangleArea = length * width;
    return rectangleArea;
  }

  /**
   * Method calculates the area of a trapezoid.
   * @param upper: length of a trapezoid's top side 
   * @param lower: length of a trapezoid's bottom side 
   * @param height: height of a trapezoid
   * @return area of a trapezoid
   */
  public static double areaTrapezoid(double upper, double lower, double height) {
    double trapezoidArea = (upper + lower) * height / 2;
    return trapezoidArea;
  }
}
