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
    //需要两个构造方法
    public DaXia(String name, int age, String bangPai, String waihao){
        this(name,age,bangPai);
        this.waihao = waihao;
    }
    public static void main(String[] args) {
        DaXia dx1 = new DaXia("岳不群",18,"华山派");
        DaXia dx2 = new DaXia("武松",19,"梁山","行者");
    }
}
