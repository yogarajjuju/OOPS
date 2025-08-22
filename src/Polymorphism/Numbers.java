package Polymorphism;

public class Numbers {
    double sum(double  a ,int b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(1,2);// here for the var a is type of int but we gave double thus java automatically cast the datatype ;
        obj.sum(1,23,34);
    }
}
