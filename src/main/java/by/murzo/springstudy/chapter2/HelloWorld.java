package by.murzo.springstudy.chapter2;

import by.murzo.springstudy.chapter2.annotated.HelloWorldConfiguration;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("getMessageRenderer", MessageRenderer.class);
        mr.render();


    }
}
