package JiChu;

public class UsingChar {
	public static void main(String[] args){
		char charA;//����һ��char����
		charA = 'A';
		char charB = '��'; //��char������ֵ
		System.out.println(charA); //���char������ֵ
		System.out.println(charB);
		char charC = '��';
		boolean equal = (charB == charC);
		//�����ıȽ�
		System.out.println(equal);
	}
}