package interfaces.nested;

public class A {
    // nested interface
    public interface  NestedInterfaces{

        boolean isOdd(int num);
    }
}
class B implements A.NestedInterfaces{

    @Override
    public boolean isOdd(int num) {
        return (num &1)==1;
    }
}

