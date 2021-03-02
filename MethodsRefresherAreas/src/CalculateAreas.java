package MethodsRefresherAreas.src;

/**
 * Methods Refresher Lab - CalculateAreas class
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/**
 * A CalculateAreas class has intialized variable to calculate the actual area
 * of different shapes.
 */
public class CalculateAreas {
  // Constant PI in math
  final static double PI_MATH = 3.1415;

  /**
   * Main method.
   * @param args
   */
  public static void main(String[] args) {
    // Construct a new Areas object
    Areas area = new Areas();

    // Create and initialize variables for the appropriate sides
    double circleRadius = 1.1;
    double squareSideLength = 2.2;
    double triangleLength = 3.3, triangleHeight = 4.4;
    double rectangleLength = 5.5, rectangleWidth = 6.6;
    double trapezoidTop = 7.7, trapezoidBottom = 8.8, trapezoidHeight = 9.9;

    // Initialize variables for the 5 variables from the Areas class
    double circleArea = area.areaCircle(circleRadius, PI_MATH);
    double squareArea = area.areaSquare(squareSideLength);
    double triangleArea = area.areaTriangle(triangleLength, triangleHeight);
    double rectangleArea = area.areaRectangle(rectangleLength, rectangleWidth);
    double trapezoidArea = area.areaTrapezoid(trapezoidTop, trapezoidBottom,
                                           trapezoidHeight);
    
    // Call the method in Output class to print out the 5 areas
    Output.outputResult(circleArea);                              
    Output.outputResult(squareArea);                              
    Output.outputResult(triangleArea);                              
    Output.outputResult(rectangleArea);                              
    Output.outputResult(trapezoidArea);                              
  }
}

/**
 * A Output class has the method to output the area computed.
 */
class Output {
  /**
   * Method prints out the area computed
   * @param area: result of computed area
   */
  public static void outputResult(double area) {
    System.out.println(area);
  }
}