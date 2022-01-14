package Yichang;

public class Test {
    public static void main(String[] args) throws GenderException {
        Person p1 = new Person("’≈Œﬁº…","ƒ–");
        Person p2 = new Person("z’‘√Ù","≈Æ");
        ZaoTangZi ztz = new ZaoTangZi();
        ztz.nan(p1);
    }
}
