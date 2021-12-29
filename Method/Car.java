package Method;

public class Car {
    int speed;
    String color;
    String name;
    String direction;
    public void driveCar(){
        speed = 50;
        direction = "南方";
    }
    public void raiseSpeed(int p_speed){
        int currentSpeed = speed + p_speed;
        speed = currentSpeed;
    }
    public boolean isOverspeed(){
        if (speed > 80){
            return true;
        }else{
            return false;
        }
    }
}

