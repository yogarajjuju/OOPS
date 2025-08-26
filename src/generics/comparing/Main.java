package generics.comparing;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student juju = new Student(12, 89.76F);
        Student aizen = new Student(5, 95.96F);
        Student ichigo = new Student(15, 75.6F);
        Student renji = new Student(2, 54.9F);
        Student zangetsu = new Student(8, 80.70F);

        Student[] list = {juju, aizen, ichigo,renji,zangetsu};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

        if(juju.compareTo(aizen)<0){
            System.out.println(juju.compareTo(aizen));
            System.out.println("Aizen has more marks");
        }
    }
}
