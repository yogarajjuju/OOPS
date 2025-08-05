public class Example {
    public static void main(String[] args) {
        Student[] st = new Student[5];
        st [0]= new Student();
        st[0].name="Juju";
        st[0].rollno=01;
        st[0].marks=40f;

        System.out.println(st[0].name + " " + st[0].rollno + " " + st[0].marks);

    }

}
class Student{
    int rollno;
    String name;
    float marks;

}
