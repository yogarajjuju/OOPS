public class Example2 {
    public static void main(String[] args) {
        Students st= new Students();
        Students juju = new Students();
        Students random1 = new Students();
//        System.out.println(juju);
        System.out.println(juju.roll);
        System.out.println(juju.name);
        System.out.println(juju.marks);
        juju.greet();

        System.out.println(random1.name);

    }
}
class Students {
    int roll;
    String name;
    float marks;

    void greet(){
        System.out.println("Hello my name is " + this.name);
    } /// we can add function over  here
    Students(){
        this.roll=23;
        this.name ="juju";
        this.marks=89;
    } //this keyword is used to act as a linker to shorter the code size
//    Students(){
//        this(13,"default",100.0f);
//    }

}

