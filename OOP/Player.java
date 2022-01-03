package OOP;

public class Player {
    public void happy(Game game){
        game.start();//一定是父类中的方法
        game.play();//有可能是子类中的方法
        game.end();//一定是父类中的方法
        System.out.println("开心");
    }
}
