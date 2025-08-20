package Inheritance;
//extends keyword is used to inherit the properity of parent / base class
public class Weight extends Box { // this is child class
    // NOTE:
    // the child class can also be called as subclass;
    double weight;
    public Weight(){
        this.weight=-1;


    }
//    super()// object class

    public Weight(double h, double l, double w, double weight) {
        super(h, l, w);// super keyword call the parent class constructor
        // used to initialise values of the parent class
        this.weight = weight;
    }
}
