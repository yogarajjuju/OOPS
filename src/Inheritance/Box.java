package Inheritance;

public class Box { // this is parent class
    //NOTE:
    // the base class also called as superclass
    double l;
    double h;
    double w;


    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    public Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
    public void info(){
        System.out.println("Running the box");
    }
}
