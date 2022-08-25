package by.murzo.springstudy.chapter4.mixed;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import by.murzo.springstudy.chapter2.decoupled.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = "classpath:spring/app-context-xml-01.xml")
public class AppConfigFive {

    @Autowired
    MessageProvider provider;

    @Bean (name = "messageRenderer")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider);
        return renderer;
    }
}
