package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(17);
        son.career();
        Daughter daughter= new Daughter(20);
        daughter.career();

        //Note: We cannot create objects iof abstract classes
        // Example: Parent mom = new Parent() -> this cannot be created directly we need implement the methods of thet classes buz it cannot run without the body .

        Parent.hello();

    }
}
