/**
 * Object and Class.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/* 
class - object:
car - blue cars;
animal - cats;
human - males;
*/

package runoob.ObjAndClass;

public class ObjAndClass1 {
  public static void main(String[] args) {}
}

/* A class can have
1.Local var: define in method, constructor, block. Method ends, auto destructed
2.Member var: define in class, not in method initialized when obj created, can
be accessed by method, constructor, specific block
3.class var: define in class, not in method, must be static
 */
// 狗类
class Dog {
  public static void main(String[] args) {}
  // 狗类特征（状态）
  String breed;       
  String color;
  int age;
  int size;

  // method 
  void eat() {}
  void run() {}
  void sleep() {}
  void name() {}
}

/* Constructor
1.Java provides the default constructor
2.When creating an obj, at least one constructor must be called
3.Constructor must have the same name with the class
*/
class Puppy1 {
  public static void main(String[] args) {}
  public Puppy1() {}
  public Puppy1(String name) {}      // One parameter constructor
}

/* Create an obj
1.Declare an obj with name and type
2.Use keywork new to create an obj
3.Use new to create an obj will call constructor to initialize the obj
 */
class Puppy2 {
  public Puppy2(String name) {
    System.out.println("puppy's name: " + name);
  }
  public static void main(String[] args) {
    new Puppy2("John");
  }
}

/* Access member var member method by the obj
Obj ref_var = new Constructor();      // Initialize the object
ref_var.var_name;                     // Access class var
ref_var.methodName();                 // Access class method
 */ 
class Puppy3 {
  int puppy3Age;
  public Puppy3(String name) {
    System.out.println("puppy name: " + name);
  }
  public void setAge(int age) {
    puppy3Age = age;
  }
  public int getAge() {
    System.out.println("puppyname: " + puppy3Age);
    return puppy3Age;
  }
  public static void main(String[] args) {
    /* Create obj */
    Puppy3 myPuppy3 = new Puppy3("John");
    /* Set age by method */
    myPuppy3.setAge(2);
    /* get age by method */
    myPuppy3.getAge();
    /* Access member var with the below way */
    System.out.println("var value: " + myPuppy3.puppy3Age);
  }
}     