package interfaces;

public class EletricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");

    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Strops");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerates");

    }
}
