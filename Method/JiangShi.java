package Method;

public class JiangShi {
    String name;
    int hp;
    int attack;

    public JiangShi(String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void eat(ZhiWu zw){
        System.out.println(this.name+"正在吃"+zw.name+"植物");
        zw.hp -= this.attack;
        System.out.println("植物还有血量 ："+zw.hp);
    }
}
