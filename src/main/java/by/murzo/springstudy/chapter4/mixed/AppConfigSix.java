package by.murzo.springstudy.chapter4.mixed;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter3.xml.ConfigurableMessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigSix {

    @Bean
    public MessageProvider provider() {
        return new ConfigurableMessageProvider("Cheat on the weekend");
    }
}
