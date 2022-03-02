import com.yuanzi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        //得到spring的上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }
}
