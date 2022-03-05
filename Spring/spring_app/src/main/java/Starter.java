import com.yuanzi.statics.*;

public class Starter {
    public static void main(String[] args) {
        //目标对象
        RentHouse target = new You();

        //代理对象
        AgencyProxy proxy = new AgencyProxy(target);

        //通过调用代理对象中的方法，执行目标对象的行为
        proxy.toRentHouse();

        Marry target2 = new You();

        MarryCompanyProxy proxy2 = new MarryCompanyProxy(target2);

        proxy2.toMarry();
    }
}
