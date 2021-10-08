public class FindBiggestInSchool{
	public static void main(String[] args){
		int gradeCount = 5; //全校有5个年级
		int classCount = 25; //每个年级有25个班级
		int studentCount = 55; //每个班级有55个学生
							//创建一个大小为阿冉冉Size的int类型数组
		int[][][] allStudents = new int[gradeCount][classCount]
		[studentCount];
		for (int i = 0; i < gradeCount; i++){
							//使用嵌套的三个for循环为三维数组赋值
			for (int j = 0;j<classCount;j++){
				for (int k = 0; k < studentCount; k++){
						 allStudents[i][j][k]=i+j+k; 
										//设置（i+1）年级（j+1）班的第（k+1）个学生的成绩
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
		System.out.println("全校最高分是：" +biggest);
    }
}