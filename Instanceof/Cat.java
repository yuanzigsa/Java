package Instanceof;

public class Cat extends Animal {
    public static void main(String[] args) {
        Animal ani = new Cat();

        if (ani instanceof Cat){
            System.out.println("��ֻè��ߣһߣ");
        }else{
            System.out.println("����һֻè");
        }
    }
}
