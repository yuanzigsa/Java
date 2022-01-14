package JiChu;

public class BooleanEqual {
	public static void main(String[] args){
	boolean valueA = true; //创建3个boolean变量
	boolean valueB = true;
	boolean valueC = false;
	boolean value = (valueA = valueB);
	//boolean类型变量的相等运算
	System.out.println(value);
	value = (valueA == valueC);
	//boolean类型变量的相等运算
	System.out.println(value);
	}
}
