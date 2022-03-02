package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 打印服务
 * **/
@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("applicationSpring");
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service = new MessageService();
//        printer.setService(service);
//        printer.printMessage();
        // 初始化spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //从容其中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        //从容器中获取MessageService对象
//        MessageService service = context.getBean(MessageService.class);

//        System.out.println(printer);
//        System.out.println(service);

//        printer.setService(service);
        printer.printMessage();

    }
}
