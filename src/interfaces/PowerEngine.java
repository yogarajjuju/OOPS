package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Strop");

    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerates");

    }
}
