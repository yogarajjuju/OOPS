package SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        // the all 3 instance will point to the same obj (only one obj)


    }
}
