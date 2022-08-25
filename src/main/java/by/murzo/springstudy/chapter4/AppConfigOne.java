package by.murzo.springstudy.chapter4;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import by.murzo.springstudy.chapter2.decoupled.StandardOutMessageRenderer;
import by.murzo.springstudy.chapter3.xml.ConfigurableMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class AppConfigOne {

    @Autowired
    Environment env;

    @Bean
    @Lazy
    public MessageProvider messageProvider() {
        return new ConfigurableMessageProvider(env.getProperty("message"));
    }

    @Bean (name = "messageRenderer")
    @Scope(value = "prototype")
    @DependsOn(value = "messageProvider")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
