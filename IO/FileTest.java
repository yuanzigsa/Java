package IO;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            file.createNewFile(); //创建一个文件,不包含文件夹
            System.out.println(file.getParentFile()); //获取文件路径
            file.delete(); //删除文件
            System.out.println(file.exists()); //查看文件是否存在
            System.out.println(file.isAbsolute()); //判断是否是绝对路径
            System.out.println(file.isDirectory()); //查看文件是否是文件夹
            System.out.println(file.isFile()); //判断是否是文件

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
