package Equals;

public class Cat {
    String name;
    String color;

    public Cat(String name,String color){
        this.color = color;
        this.name = name;
    }


    public static void main(String[] args) {
        Cat c1 = new Cat("С��","��ɫ");
        Cat c2 = new Cat("С��","��ɫ");

        System.out.println(c1 == c2); //false Ĭ���жϵ�������������ڴ��ַ�Ƿ�һ��
    }
}
