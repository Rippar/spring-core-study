package by.murzo.springstudy.chapter4.annotated;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import by.murzo.springstudy.chapter2.decoupled.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "by.murzo.springstudy.chapter4.annotated")
public class AppConfigTwo {

    @Autowired
    MessageProvider provider;

    @Bean(name = "messageRenderer")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider);
        return renderer;
    }
}
