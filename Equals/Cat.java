package Equals;

public class Cat {
    String name;
    String color;

    public Cat(String name,String color){
        this.color = color;
        this.name = name;
    }


    public static void main(String[] args) {
        Cat c1 = new Cat("小花","红色");
        Cat c2 = new Cat("小花","红色");

        System.out.println(c1 == c2); //false 默认判断的是两个对象的内存地址是否一致
    }
}
