package OOP.OopExp1;

public abstract class AbstractDao implements IDAO {
    //void connect
    @Override
    public void add() {
        System.out.println("增加");

    }

    @Override
    public void del() {
        System.out.println("删除");

    }

    @Override
    public void upd() {
        System.out.println("修改");

    }

    @Override
    public void set() {
        System.out.println("查询");

    }
}
