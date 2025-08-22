package Polymorphism;
// NOTE: Every class is inherited form the Object class it is by default

public class Main  extends  Object{
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        circle.area();
    }
}
