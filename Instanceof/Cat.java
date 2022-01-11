package Instanceof;

public class Cat extends Animal {
    public static void main(String[] args) {
        Animal ani = new Cat();

        if (ani instanceof Cat){
            System.out.println("是只猫，撸一撸");
        }else{
            System.out.println("不是一只猫");
        }
    }
}
