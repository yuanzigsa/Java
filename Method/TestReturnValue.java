package Method;

public class TestReturnValue {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.raiseSpeed(70);
        boolean isOverspeed = myCar.isOverspeed();
        if(isOverspeed){
            System.out.println("骑车超速行驶中");
        }else{
            System.out.println("汽车没有超速");
        }
        myCar.raiseSpeed(70);
        isOverspeed = myCar.isOverspeed();
        if (isOverspeed){
            System.out.println("汽车超速行驶中");
        }else {
            System.out.println("汽车没有超速");
        }
    }
}
