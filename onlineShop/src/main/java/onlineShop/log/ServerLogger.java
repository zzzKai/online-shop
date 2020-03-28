package onlineShop.log;

import org.springframework.stereotype.Component;

// tell Spring this is a bean and Bean id
@Component(value = "serverLogger") // Bean id
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
