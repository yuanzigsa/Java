package JiChu;

public class BooleanEqual {
	public static void main(String[] args){
	boolean valueA = true; //����3��boolean����
	boolean valueB = true;
	boolean valueC = false;
	boolean value = (valueA = valueB);
	//boolean���ͱ������������
	System.out.println(value);
	value = (valueA == valueC);
	//boolean���ͱ������������
	System.out.println(value);
	}
}
