package JiChu;

public class FindBiggest{
	public static void main(String[] args){
		int arraySize = 55; //��������С��int����
		int[] students = new int[arraySize];//����һ����СΪarraySize��int��������
		for (int i = 0;i < arraySize;i++){//ʹ��for��������Ԫ�ظ�ֵ
			students[i] = i+1;
		}
		int biggest = 0; //����int����biggest������������߷�
		for (int i = 0;i<arraySize;i++){ //ʹ��for�����������е�ÿ��Ԫ�أ��ҵ�����Ԫ��ֵ
			if(biggest <= students[i]){
				biggest = students[i];
			}
		}
		System.out.println("ȫ����߷��ǣ�" + biggest);
	}
}