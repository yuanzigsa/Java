package OopExp1;

public abstract class AbstractDao implements IDAO {
    //void connect
    @Override
    public void add() {
        System.out.println("����");

    }

    @Override
    public void del() {
        System.out.println("ɾ��");

    }

    @Override
    public void upd() {
        System.out.println("�޸�");

    }

    @Override
    public void set() {
        System.out.println("��ѯ");

    }
}
