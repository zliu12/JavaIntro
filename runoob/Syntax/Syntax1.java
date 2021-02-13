/**
 * 1.Java Syntax
 *
 * Copyright (c) [2021], Zhao Liu.
 */

 /* 
object：一个实例（狗），有特征（颜色、品种）和行为（睡觉、吃饭）
class：模版，描述一类对象的行为和特征
method：行为，一个类可有多种methods，逻辑运算、数据修改以及所有动作都是在method中完成
variable：每个obj都有独特的实体变量，其值决定obj特征
 */
package runoob.Syntax;

public class Syntax1 {
  /* 
  public: access modifier(specifier)
  static: keyword
  void: return type
  main: method name
  String[]: class string
  args: string array */
  public static void main(String[] args) {
    System.out.println("Hello Java!");
  }
}

/* 
javac <filename.java>: create a Java class file
java <filename>: run Java class file
 */

/* 
1.Case sensitive: Hello != hello
2.Class name: MyFirstJavaClass
3.Method name: myFirstMethod
4.Source file: same name with the pulic class
5.Main: execution begins from public static void main(String[] args)
 */

/* 
Legal identifier: age, $salary, _value, __1_value
Illegal identifer: 123abc, -salary
 */

/*
Access modifier(specifier): default, public, protected, private
Nonaccess modifier: final, abstract, static, synchronized
 */

/* 
Variable: local, class(static), member(nonstatic) 
 */

/* 
1.Enum var' value is preset
2.Enum can be declared separately, or inside the class
3.Method, var, constructor can be declared and defined inside the enum */
class FreshJuice {
  enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
  FreshJuiceSize size;
}
class FreshJuiceTest {
  public static void main(String[] args) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.LARGE;
  }
}

/* 
throws:用来声明一个方法可能产生的所有异常，不做任何处理而是将异常往上传，谁调用我我就抛给谁。
throws在方法后边声明异常，其实就是自己不想对异常做出任何的处理，告诉别人自己可能出现的异常，
交给别人处理，让别人处理
throw:用来抛出一个具体的异常类型。
throw就是自己处理一个异常，两种方式要么是自己捕获异常try...catch代码块，要么是抛出一个异常
（throws异常） */