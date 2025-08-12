package Example.staticc;

public class InnerClass {
    // outside class cannot be static eg: static public main{} but only inner class can be static;
    // static classes don't depent on the outer class
    // a static class cannot refer a non static class hence it throws a error.
    // but if we but the class test in the outside it can be executed but it changes the reference of the objects like here the example it will print the a and b as Aizen
     static class Test{
         String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Juju");
        Test b = new Test("Aizen");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
