package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human juju= new Human(20,"juju");
//        Human twin = new Human(juju);
        // better way to clone a object buz new keyword consumes more memory

        Human twin = (Human)juju.clone();
        // if some internal things throws an exception it should be declared in the main method / method :

        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(juju.arr));
    }
}
