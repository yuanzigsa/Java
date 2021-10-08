package Class;

public class UseMotorcade {
    public static void main(String[] args){
        Motorcade groupCar = null;
        groupCar = new Motorcade();
        groupCar.name = "一个车队";
        int carCount = 5;
        groupCar.cars = new  Car[5];
        String direction = "镇江";
        for (int i = 0; i < carCount;i++){
            groupCar.cars[i] = new Car();
            groupCar.cars[i].name = "汽车" + (i+1);
            groupCar.cars[i].direction = direction;
        }
        System.out.println("车队的名称为："+ groupCar.name);
        System.out.println("车队中的汽车的名字分别为：");
        for (int i = 0; i < carCount;i++){
            System.out.println(groupCar.cars[i].name);
        }
    }
}
