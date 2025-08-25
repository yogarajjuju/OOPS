package interfaces.extendes;

public interface A {
    //Static  interface method should have body
    // Call  via the interface name



//    static void greeting(); it cannot be like this
    // It should be like this
    static void greeting(){
        System.out.println("hey i am  static method"); //body
    }


  default  void fun(){
      System.out.println("i am in A");
  }
}
