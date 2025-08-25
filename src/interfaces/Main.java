package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

//        car.start();
//        car.stop();
//        car.acc();
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }

}
