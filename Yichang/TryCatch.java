package Yichang;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            // e.printStackTrace(); //��ӡ������Ϣ
            System.out.println("ϵͳ�����ˣ�����ϵ����Ա");
        }finally {
            System.out.println("��ð�������finally");
        }
    }
}
