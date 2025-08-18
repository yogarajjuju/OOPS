package SingletonClass;
//singleton means only one instance of a class can be created i.e it cannot be used in another file of java so we can use private access modifier:
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //check that whether  1 obj is created or not
        if(instance==null){
            instance=new Singleton();
        }
        return instance;

    }
}
