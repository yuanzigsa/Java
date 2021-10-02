package chapter6;

public class UserCarDefaultValue {
    public static void main(String[] args){
        Car carDefault; //声明一个car类的变量
        carDefault = new Car(); //创建一个car类的实体
        System.out.println("汽车的默认速度是："+carDefault.speed);
        System.out.println("汽车的颜色是："+carDefault.color);
        System.out.println("汽车的名字是："+carDefault.name);
        System.out.println("汽车的默认行驶方向是："+carDefault.direction);
    }
}
