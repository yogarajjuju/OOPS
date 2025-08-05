public class Example2 {
    public static void main(String[] args) {
        Students st= new Students();
        Students juju = new Students();
//        System.out.println(juju);
        System.out.println(juju.roll);
        System.out.println(juju.name);
        System.out.println(juju.marks);

    }
}
class Students {
    int roll;
    String name;
    float marks;

    Students(){
        this.roll=23;
        this.name ="juju";
        this.marks=89;
    } //this keyword is used to act as a linker to shorter the code size

}

