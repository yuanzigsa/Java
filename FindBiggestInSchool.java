public class FindBiggestInSchool{
	public static void main(String[] args){
		int gradeCount = 5; //ȫУ��5���꼶
		int classCount = 25; //ÿ���꼶��25���༶
		int studentCount = 55; //ÿ���༶��55��ѧ��
							//����һ����СΪ��ȽȽSize��int��������
		int[][][] allStudents = new int[gradeCount][classCount]
		[studentCount];
		for (int i = 0; i < gradeCount; i++){
							//ʹ��Ƕ�׵�����forѭ��Ϊ��ά���鸳ֵ
			for (int j = 0;j<classCount;j++){
				for (int k = 0; k < studentCount; k++){
						 allStudents[i][j][k]=i+j+k; 
										//���ã�i+1���꼶��j+1����ĵڣ�k+1����ѧ���ĳɼ�
			}
		}
	}
		int biggest = 0;
		for (int i = 0; i < gradeCount; i++) {
			for (int j = 0; j < classCount; j++) {
				for (int k = 0; k < studentCount; k++) {
					if (biggest <= allStudents[i][j][k]) {
						biggest = allStudents[i][j][k];
					}
				}
			}
		}
		System.out.println("ȫУ��߷��ǣ�" +biggest);
    }
}