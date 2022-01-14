package JiChu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountScripComplex {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int serveTimes = 0; 	// 结账员需要接待的顾客的次数
		int totalCost = 0;		// 存放一次结账的总消费金额
		int hasMoreGoods = 0;	// 在结账过程中，用来存放是否还有商品要结算。1为
								// 有，其他值为没有
		System.out.println("请输入结账员需要接待的顾客次数：");
		serveTimes = Integer.parseInt(reader.readLine());
								// 从控制台读取输入的serveTimes的值
		for (int i = 0; i < serveTimes; i++) {
			totalCost = 0;		// 每次处理结账之前，都要将totalCost设置为0
			do {	// 使用do-while语句，一个顾客至少要买一样东西，否则不需结账
					// 从控制台读取单价，如果单价不小于0则继续，否则要重新输入
				System.out.println("请输入商品的单价：");
				int price = Integer.parseInt(reader.readLine());
				if (price < 0) {
					System.out.println("商品单价不能小于0！");
					hasMoreGoods = 1;		// 赋值1，确定下次肯定会循环
					continue;
				}
				// 从控制台读取数量，如果单价不小于0则继续，否则要重新输入
				System.out.println("请输入商品的数量：");
				int amount = Integer.parseInt(reader.readLine());
				if (price < 0) {
					System.out.println("商品数量不能小于0！");
					hasMoreGoods = 1;		// 赋值1，确定下次肯定会循环
					continue;
				}
				totalCost = totalCost + price * amount;  // 计算当前的总价
				System.out.println("当前总价为：" + totalCost);
											// 输出当前的总价
				System.out.println("还有商品需要结算吗（输入1为有，其他数字为没有）？");
				hasMoreGoods = Integer.parseInt(reader.readLine());
											// 本次结算是否还有商品
			} while (hasMoreGoods == 1);
			System.out.println("本次消费金额为：" + totalCost);
											// 输出本次结账的总价
			System.out.println("=====谢谢光临，欢迎下次再来！=====");
											// 一次结账过程结束
		}
		System.out.println(serveTimes + "次结算已经结束，结账员可以休息一下啦！");
	}
}

