package Method;

public class TestCar {
    public static void  main(String[] args) {
        Car  myCar = new Car();
        myCar.driveCar();
        System.out.print("现在的车速为：");
        System.out.print(myCar.speed);
        System.out.print("，行驶方向为：");
        System.out.print(myCar.direction);
    }
}
