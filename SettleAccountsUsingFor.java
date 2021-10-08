public class SettleAccountsUsingFor{
	public static void main(String[] args){
		for(int times = 0;times < 5;times ++){
			int price = 5;
			int amount = 10;
			if(price > 0 && amount > 0){
				int totalcost = price * amount;
				System.out.println(totalcost);
			}else{
				System.out.println("价格和数量的值必须大于0，否则无法计算总价!!!");
			}
		}
	}
}