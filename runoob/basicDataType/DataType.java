/**
 * Basic Java Data Type
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/* 8 built-in types 
Six integral type (4 integer, 2 float), 1 string type, 1 boolean type.
1.byte: 
  8 bits, signed, min:-128(2^7), max:127(2^7 - 1), default 0, mainly used
  for replacing int type so that saves storges, only need 1/4 storage of int
  type.
2.short:
  16 bits, signed, min:-2^15, max:2^15 - 1, default 0, 1/2 storage of int type.
3.int:
  32 bits, signed, min:-2^31, max:2^31 - 1, default 0, integral type is int by 
  default.
4.long:
  64 bits, signed, min:-2^63, max:2^63 - 1, default 0L.
5.float:
  32 bits, default 0.0f, can't be used for currency.
6.double:
  64 bits, default 0,0d, can't be used for currency, floating type is double by
  default.
7.boolean:
  1 bit, default false, only true or false.
8.char:
  16 unicode, min:0, max:65535, can store any character.
9.string class: default null.
*/

package runoob.basicDataType;

public class DataType {
  static boolean bool;
  static byte by;
  static char ch;
  static short sh;
  static int i;
  static long l;
  static float f;
  static double d;
  static String str;

  public static void main(String[] args) {
    // byte
    System.out.println("Byte size: " + Byte.SIZE);
    System.out.println("Wrapper class: java.lang.Byte");
    System.out.println("Min: " + Byte.MIN_VALUE);
    System.out.println("Max: " + Byte.MAX_VALUE);
    System.out.println("Byte default: " + by);
    System.out.println();
    // short
    System.out.println("Short size: " + Short.SIZE);
    System.out.println("Wrapper class: java.lang.Short");
    System.out.println("Min: " + Short.MIN_VALUE);
    System.out.println("Max: " + Short.MAX_VALUE);
    System.out.println("Short default: " + sh);
    System.out.println();
    // int
    System.out.println("Int size: " + Integer.SIZE);
    System.out.println("Wrapper class: java.lang.Integer");
    System.out.println("Min: " + Integer.MIN_VALUE);
    System.out.println("Max: " + Integer.MAX_VALUE);
    System.out.println("Int default: " + i);
    System.out.println();
    // long
    System.out.println("Long size: " + Long.SIZE);
    System.out.println("Wrapper class: java.lang.Long");
    System.out.println("Min: " + Long.MIN_VALUE);
    System.out.println("Max: " + Long.MAX_VALUE);
    System.out.println("Long default: " + l);
    System.out.println();
    // float
    System.out.println("Float size: " + Float.SIZE);
    System.out.println("Wrapper class: java.lang.Float");
    System.out.println("Min: " + Float.MIN_VALUE);
    System.out.println("Max: " + Float.MAX_VALUE);
    System.out.println("Float default: " + f);
    System.out.println();
    // double
    System.out.println("Double size: " + Double.SIZE);
    System.out.println("Wrapper class: java.lang.Double");
    System.out.println("Min: " + Double.MIN_VALUE);
    System.out.println("Max: " + Double.MAX_VALUE);
    System.out.println("Double default: " + d);
    System.out.println();
    // char
    System.out.println("Character size: " + Character.SIZE);
    System.out.println("Wrapper class: java.lang.Character");
    System.out.println("Min: " + (int)Character.MIN_VALUE);
    System.out.println("Max: " + (int)Character.MAX_VALUE);
    System.out.println("Character default: " + ch);
    System.out.println();
    // boolean
    System.out.println("Boolean default: " + bool);
    System.out.println();
    // String
    System.out.println("String default: " + str);
  }
  /* Reference type: default null */
  Ref ref1 = new Ref("Runoob");
  /* Constant: use keyword final, uppercase */
  final double PI = 3.14159265354;
  final int DECIMAL = 100;    // digital
  final int OCTAL = 0144;     // octal 
  final int HEXA = 0x64;      // hexadecimal
  /* type cast: 
  1.Low to high: byte, short, char->int->long->float->double.
  2.Low to high must use explicit cast, truncation may happen
  3.floating point to integral is abandoning the decimal part, not rounding off
  4.long type must postfix 'L' with the value
  */
}

class Ref {
  String str;
  public Ref (String str) {
    this.str = str;
  }
}

