package Method;

public class ZhiWu {
    String name;
    int hp;
    int attack;
    public ZhiWu(String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }
    //ֲ���ʬ
    public void fight( JiangShi js){
        System.out.println(this.name+"�ڴ�"+js.name);
        //��ʬ��Ѫ
        js.hp-=this.attack;
        System.out.println("��ʬ��Ѫ��ʣ��"+js.hp);
    }
}
