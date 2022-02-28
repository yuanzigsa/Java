package hello;

import org.springframework.stereotype.Component;

@Component
/**
 * Created by yuanzi 2022.2.28 16:27:16
 * 打印服务
 * **/
public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService...");
    }

    public String getMessage(){
        return "Hello Yuanzi";
    }
}
