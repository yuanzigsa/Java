package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectLiu2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("IO/person.dat")));
        Object obj = ois.readObject();
        Person p = (Person) obj;
        System.out.println(p.getName());
    }
}
