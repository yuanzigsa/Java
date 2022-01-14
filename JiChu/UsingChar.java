package JiChu;

public class UsingChar {
	public static void main(String[] args){
		char charA;//创建一个char变量
		charA = 'A';
		char charB = '人'; //给char变量赋值
		System.out.println(charA); //输出char变量的值
		System.out.println(charB);
		char charC = '人';
		boolean equal = (charB == charC);
		//变量的比较
		System.out.println(equal);
	}
}