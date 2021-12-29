package Method;

public class Client {
    public static void main(String[] args) {
        //创建植物和僵尸
        ZhiWu zw = new ZhiWu("豌豆",1000,5);
        JiangShi js =  new JiangShi("铁通僵尸",800,20);

        zw.fight(js);
        js.eat(zw);
    }
}
