public class SunWuKong extends Hero{
    String name = "孙大圣";

    public void chi(){
        System.out.println(this.name+"在吃桃子");
    }
    public static void main(String[] args){
        SunWuKong s = new SunWuKong();
        s.chi();
    }
}