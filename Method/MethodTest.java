package Method;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class MethodTest {
    public static void main(String[] args) {
    System.out.println(compare(10,20));
    System.out.println(compare((byte)10,(byte)20));
    System.out.println(compare((short) 10,(short) 20));
    System.out.println(compare((long) 10,(long) 20));
    }
    public static boolean compare(int a,int b){
        System.out.print("int�Ƿ����:");
        return a == b;
    }
    public static boolean compare(byte a,byte b){
        System.out.print("byte�Ƿ���ȣ�");
        return a == b;
    }
    public static boolean compare(short a,short b){
        System.out.print("short�Ƿ���ȣ�");
        return a == b;
    }
    public static boolean compare(long a,long b){
        System.out.print("long�Ƿ���ȣ�");
        return a == b;
    }
}