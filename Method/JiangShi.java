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
        System.out.println(this.name+"���ڳ�"+zw.name+"ֲ��");
        zw.hp -= this.attack;
        System.out.println("ֲ�ﻹ��Ѫ�� ��"+zw.hp);
    }
}
