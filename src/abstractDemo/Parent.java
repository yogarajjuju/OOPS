package abstractDemo;
// Abstract methods needs to be overriden .

public abstract  class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    // static methods can be created but u cannot create abstract static methods in here .
    static  void hello()
    {
        System.out.println("hey");
    }
    abstract void career();
    abstract void partner();

//    abstract Parent() abstract constructors are noy allowed , buz it cannot run without the body .
}
