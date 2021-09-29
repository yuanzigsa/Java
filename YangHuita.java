public class YangHuita{
	public static void main(String[] args){
		int levelCount = 10; //程序生成的杨辉三角层数
		//在这里数组的第二维的大小为0，所以每个数组中其实没有任何int元素
		int[][] yangHui = new int[levelCount][0];
		//创建一个二维数组用来保存杨辉三角的值
		//使用for循环为杨辉三角的每一层创建一个int数组
		for (int i = 0;i<levelCount;i++){//每次循环生成一行杨辉三角
			yangHui[i]=new int[i+1];
			//此层杨辉三角的中包含的元素个数为（i+1）个
			for (int j = 0; j<=i; j++){
				//每次循环计算杨辉三角的一行中的一个元素
				if (i == 0){ //如果是第一行，则直接复制为1
					yangHui[i][j] = 1;
				} else {//如果不是第一行，则根据上一行的值计算当前每个元素的值
						int value = 0; //用力啊保存当前元素的int变量
						if (j >= 1) {
							//根据杨辉三角的计算规则，判断此上方是否有元素
							value += yangHui[i-1][j-1];
							//有则将当前元素上方的值加到value变量中
						}
						if (j < i){
							//根据杨辉三角的计算规则，判断此上方左边是否有元素
							value += yangHui[i-1][j];
							//有则将当前元素上方的值加到value变量中
						}
						yangHui[i][j] = value; //讲value的值赋给当前元素
				}
			}
		}
		for (int i=0; i<levelCount;i++){//循环输出数组元素的值
			for (int j = 0; j <= i;j++){
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("下面输出塔形的杨辉三角");
		for (int i = 0; i < levelCount; i++){//输出塔形的杨辉三角
			for(int j = 0; j < levelCount - i - 1; j++){
				System.out.print("\t"); //输出相应个数的制表符
			}
			for (int j = 0; j <= i; j++){ //读取并输出杨辉三角的内容
				System.out.print(yangHui[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}