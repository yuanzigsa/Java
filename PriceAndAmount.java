public class PriceAndAmount{
	public static void main(String[] args){
		int price = -5; //������double����
		int amount = -10; 
		if(price > 0 && amount > 0){
			//ʹ��if�����double������ֵ
			int totalcost =  price*amount;
			//�����ֵ���Ǵ���0�ģ�����Ż�ִ�е�����
			System.out.println(totalcost);
		}
	}
}