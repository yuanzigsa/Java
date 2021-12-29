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
    //Ö²Îï´ò½©Ê¬
    public void fight( JiangShi js){
        System.out.println(this.name+"ÔÚ´ò"+js.name);
        //½©Ê¬µôÑª
        js.hp-=this.attack;
        System.out.println("½©Ê¬µÄÑªÁ¿Ê£Óà"+js.hp);
    }
}
