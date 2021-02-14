/**
 * Modifiers.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

package runoob.modifier;

/* Access Modifier
1.default: accessed within the same package, modify class, interface,var,method.
2.private: accessed within the same class, modify var, method, excluding class.
3.public: accessed within all classes, modify class, api, var, method.
4.protected: accessed within the same class and its derived class, modify var,
  method, excluding class.
*/

public class Modifier {
  // default
  String version = "1.5.1";
  boolean processOrder() {
    if (version == "1.5.1") {
      return true;
    }
    return false;
  }
  // Private
  private String format;
  // Using getter to access private var
  public String getFormat() {
    return this.format;
  }
  // Using mutator to modify private var
  public void setformat(String format) {
    this.format = format;
  }
  // public, main must be public
  public static void main(String[] args) {}  
}

/* Protected
1. Derived class and base class in the same package, then protected var can
be accessed by any vars, methods, constructors of other classes in the same
package.
2. Not in the same package, then in the derived class, instanciations of the
derived class can access protected methods inherited from the base class,
but can't access the protected methods of instanciations of the base class.
*/
class AudioPlayer {   // base class
  protected boolean openSpeaker(String sp) {
    return false;
  }
}
class StreamingAudioPlayer extends AudioPlayer {    // derived c lass
  protected boolean openSpeaker(String sp) {    // override
    return true;
  }
}
