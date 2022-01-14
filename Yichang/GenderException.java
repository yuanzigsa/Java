package Yichang;

public class GenderException extends Exception {
    //自己定义的异常必须继承Exceotion或者RuntimeException
    public  GenderException(String msg){
        super(msg);//调用父类的构造方法。
    }
}
