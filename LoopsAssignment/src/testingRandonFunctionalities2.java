/**
 * Class - testingRandonFunctionalities2
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class testingRandonFunctionalities2 {
  public static void main(String[] args) {
    RandomFunctionalities2 test = new RandomFunctionalities2();

    // Test mixWords
    System.out.println("mixWords: ");
    System.out.print("1. hi + Java = hJiava: ");
    System.out.println(test.mixWords("hi", "Java"));        // hJiava
    System.out.print("2. Java + hi = Jhaiva: ");
    System.out.println(test.mixWords("Java", "hi"));        // Jhaiva
    System.out.print("3. Java + says = Jsaavyas: ");
    System.out.println(test.mixWords("Java", "says"));      // Jsaavyas
    System.out.print("4. Java + '' = Java: ");
    System.out.println(test.mixWords("Java", ""));          // Java
    System.out.print("5. '' + JavaScript = JavaScript: ");
    System.out.println(test.mixWords("", "JavaScript"));    // JavaScript
    System.out.println();

    // Test switcheroo
    System.out.println("switcheroo: ");
    System.out.print("1. HelloWorld: ");
    System.out.println(test.switcheroo("HelloWorld"));          // elHoWlrlod
    System.out.print("2. HelloJava: ");
    System.out.println(test.switcheroo("HelloJava"));           // elHoJlvaa
    System.out.print("3. Windows: ");
    System.out.println(test.switcheroo("Windows"));             // inWowds
    System.out.print("4. Mac: ");
    System.out.println(test.switcheroo("Mac"));                 // acM
    System.out.print("5. OK: ");
    System.out.println(test.switcheroo("OK"));                  // OK
    System.out.print("6. : ");
    System.out.println(test.switcheroo(" "));                   // Empty output
    System.out.println();

    // Test longestSet
    System.out.println("longestSet: ");
    System.out.print("1. NBAAAAAAAAAANBA: ");
    System.out.println(test.longestSet("NBAAAAAAAAAANBA"));     // NBA
    System.out.print("2. dada: ");
    System.out.println(test.longestSet("dada"));                // da
    System.out.print("3. qq: ");
    System.out.println(test.longestSet("qq"));                  // q
    System.out.print("4. qqq: ");
    System.out.println(test.longestSet("qqq"));                 // q
    System.out.print("5. qqqq: ");
    System.out.println(test.longestSet("qqqq"));                // qq
    System.out.print("6. QiChang: ");
    System.out.println(test.longestSet("QiChang"));             // Empty output
  }
}
