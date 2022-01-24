package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectLiu {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream(new File("IO/person.dat")));
        Person p = new Person(1,"≤Ã–Ï¿§",18);
        oos.writeObject(p);

        oos.flush();
        oos.close();

    }
}
