package JiChu;

public class YangHuita{
	public static void main(String[] args){
		int levelCount = 10; //�������ɵ�������ǲ���
		//����������ĵڶ�ά�Ĵ�СΪ0������ÿ����������ʵû���κ�intԪ��
		int[][] yangHui = new int[levelCount][0];
		//����һ����ά������������������ǵ�ֵ
		//ʹ��forѭ��Ϊ������ǵ�ÿһ�㴴��һ��int����
		for (int i = 0;i<levelCount;i++){//ÿ��ѭ������һ���������
			yangHui[i]=new int[i+1];
			//�˲�������ǵ��а�����Ԫ�ظ���Ϊ��i+1����
			for (int j = 0; j<=i; j++){
				//ÿ��ѭ������������ǵ�һ���е�һ��Ԫ��
				if (i == 0){ //����ǵ�һ�У���ֱ�Ӹ���Ϊ1
					yangHui[i][j] = 1;
				} else {//������ǵ�һ�У��������һ�е�ֵ���㵱ǰÿ��Ԫ�ص�ֵ
						int value = 0; //���������浱ǰԪ�ص�int����
						if (j >= 1) {
							//����������ǵļ�������жϴ��Ϸ��Ƿ���Ԫ��
							value += yangHui[i-1][j-1];
							//���򽫵�ǰԪ���Ϸ���ֵ�ӵ�value������
						}
						if (j < i){
							//����������ǵļ�������жϴ��Ϸ�����Ƿ���Ԫ��
							value += yangHui[i-1][j];
							//���򽫵�ǰԪ���Ϸ���ֵ�ӵ�value������
						}
						yangHui[i][j] = value; //��value��ֵ������ǰԪ��
				}
			}
		}
		for (int i=0; i<levelCount;i++){//ѭ���������Ԫ�ص�ֵ
			for (int j = 0; j <= i;j++){
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("����������ε��������");
		for (int i = 0; i < levelCount; i++){//������ε��������
			for(int j = 0; j < levelCount - i - 1; j++){
				System.out.print("\t"); //�����Ӧ�������Ʊ��
			}
			for (int j = 0; j <= i; j++){ //��ȡ�����������ǵ�����
				System.out.print(yangHui[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}