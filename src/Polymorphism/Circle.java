package Polymorphism;

public class Circle extends Shapes {
    //this will run  when obj  of circle is created
    // hence it is overriding the parent method
    @Override// this is called annotation
    // this is used to check whether a method is override or not :
    void area(){
        System.out.println("The area is pie * r*r");
    }
}
