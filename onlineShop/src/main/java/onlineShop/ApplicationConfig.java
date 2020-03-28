package onlineShop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import onlineShop.log.Logger;
import onlineShop.log.PaymentAction;
import onlineShop.log.ServerLogger;

@Configuration
public class ApplicationConfig {

    @Bean
    public Logger getLogger() {
        return new ServerLogger();
    }

    @Bean(name = "paymentAction")
    public  PaymentAction getPaymentAction() {
         return new PaymentAction();
    }
}

