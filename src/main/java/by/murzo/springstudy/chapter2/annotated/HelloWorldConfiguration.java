package by.murzo.springstudy.chapter2.annotated;

import by.murzo.springstudy.chapter2.decoupled.HelloWorldMessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import by.murzo.springstudy.chapter2.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer getMessageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
