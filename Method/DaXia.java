package Method;

public class DaXia {
    String name;
    String waihao;
    int age;
    String bangPai;

    public DaXia(String name, int age, String bangPai){
        this.name = name;
        this.age = age;
        this.bangPai = bangPai;
    }
    //��Ҫ�������췽��
    public DaXia(String name, int age, String bangPai, String waihao){
        this(name,age,bangPai);
        this.waihao = waihao;
    }
    public static void main(String[] args) {
        DaXia dx1 = new DaXia("����Ⱥ",18,"��ɽ��");
        DaXia dx2 = new DaXia("����",19,"��ɽ","����");
    }
}
