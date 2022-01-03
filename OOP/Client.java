package OOP;

public class Client {
    public static void main(String[] args) {
        Game game1 = new DNF(); //向上转型
        Game game2 = new LOL();
        Game game3 = new CS();

        Player p =  new Player();
        p.happy(game1);
        p.happy(game2);
        p.happy(game3);
    }
}
