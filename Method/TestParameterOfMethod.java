package Method;

public class TestParameterOfMethod {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.driveCar();
        myCar.raiseSpeed(5);
        System.out.print("现在车速为：");
        System.out.print(myCar.speed);
        System.out.print("，行驶方向为：");
        System.out.print(myCar.direction);
    }
}
