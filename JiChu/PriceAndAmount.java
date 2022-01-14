package JiChu;

public class PriceAndAmount{
	public static void main(String[] args){
		int price = -5; //创建两double变量
		int amount = -10; 
		if(price > 0 && amount > 0){
			//使用if语句检查double变量的值
			int totalcost =  price*amount;
			//如果其值都是大于0的，程序才会执行到这里
			System.out.println(totalcost);
		}
	}
}