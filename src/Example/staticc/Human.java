package Example.staticc;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name , int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary= salary;
        this.married= married;
        Human.population +=1;// to access static var we need to use class name ;
    }
}
