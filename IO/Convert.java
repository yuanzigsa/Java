package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Convert {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("从System.in接收到的是："+s);
    }
}
