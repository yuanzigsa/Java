package OOP.Yichang;

public class ZaoTangZi {
    public void nan(Person p) throws GenderException {
        if(p.gender.equals("男")){
            System.out.println("欢迎光临");
        } else {
            //需要抛出一个异常
            throw new GenderException("性别不对，这里是男澡堂子");
        }
    }
}
