import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountScripComplex {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int serveTimes = 0; 	// ����Ա��Ҫ�Ӵ��Ĺ˿͵Ĵ���
		int totalCost = 0;		// ���һ�ν��˵������ѽ��
		int hasMoreGoods = 0;	// �ڽ��˹����У���������Ƿ�����ƷҪ���㡣1Ϊ
								// �У�����ֵΪû��
		System.out.println("���������Ա��Ҫ�Ӵ��Ĺ˿ʹ�����");
		serveTimes = Integer.parseInt(reader.readLine());
								// �ӿ���̨��ȡ�����serveTimes��ֵ
		for (int i = 0; i < serveTimes; i++) {
			totalCost = 0;		// ÿ�δ������֮ǰ����Ҫ��totalCost����Ϊ0
			do {	// ʹ��do-while��䣬һ���˿�����Ҫ��һ�����������������
					// �ӿ���̨��ȡ���ۣ�������۲�С��0�����������Ҫ��������
				System.out.println("��������Ʒ�ĵ��ۣ�");
				int price = Integer.parseInt(reader.readLine());
				if (price < 0) {
					System.out.println("��Ʒ���۲���С��0��");
					hasMoreGoods = 1;		// ��ֵ1��ȷ���´ο϶���ѭ��
					continue;
				}
				// �ӿ���̨��ȡ������������۲�С��0�����������Ҫ��������
				System.out.println("��������Ʒ��������");
				int amount = Integer.parseInt(reader.readLine());
				if (price < 0) {
					System.out.println("��Ʒ��������С��0��");
					hasMoreGoods = 1;		// ��ֵ1��ȷ���´ο϶���ѭ��
					continue;
				}
				totalCost = totalCost + price * amount;  // ���㵱ǰ���ܼ�
				System.out.println("��ǰ�ܼ�Ϊ��" + totalCost);
											// �����ǰ���ܼ�
				System.out.println("������Ʒ��Ҫ����������1Ϊ�У���������Ϊû�У���");
				hasMoreGoods = Integer.parseInt(reader.readLine());
											// ���ν����Ƿ�����Ʒ
			} while (hasMoreGoods == 1);
			System.out.println("�������ѽ��Ϊ��" + totalCost);
											// ������ν��˵��ܼ�
			System.out.println("=====лл���٣���ӭ�´�������=====");
											// һ�ν��˹��̽���
		}
		System.out.println(serveTimes + "�ν����Ѿ�����������Ա������Ϣһ������");
	}
}