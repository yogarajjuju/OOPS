package Inheritance;
//extends keyword is used to inherit the properity of parent / base class
public class BoxWeightt extends Box { // this is child class
    // NOTE:
    // the child class can also be called as subclass;
    double weight;
    public BoxWeightt(){
        this.weight=-1;


    }
    BoxWeightt(BoxWeightt other){
        super(other);
        weight= other.weight;
    }

//    super()// object class

    public BoxWeightt(double h, double l, double w, double weight) {
        super(h, l, w);// super keyword call the parent class constructor
        // used to initialise values of the parent class
        this.weight = weight;
    }
}
