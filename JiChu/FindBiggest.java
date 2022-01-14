package JiChu;

public class FindBiggest{
	public static void main(String[] args){
		int arraySize = 55; //存放数组大小的int变量
		int[] students = new int[arraySize];//创建一个大小为arraySize的int类型数组
		for (int i = 0;i < arraySize;i++){//使用for语句对数组元素赋值
			students[i] = i+1;
		}
		int biggest = 0; //创建int变量biggest，用来保存最高分
		for (int i = 0;i<arraySize;i++){ //使用for语句遍历数组中的每个元素，找到最大的元素值
			if(biggest <= students[i]){
				biggest = students[i];
			}
		}
		System.out.println("全班最高分是：" + biggest);
	}
}