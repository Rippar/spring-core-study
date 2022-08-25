package by.murzo.springstudy.chapter4;

import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import by.murzo.springstudy.chapter4.annotated.AppConfigTwo;
import by.murzo.springstudy.chapter4.mixed.AppConfigFive;
import by.murzo.springstudy.chapter4.multiple.AppConfigThree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplicationTwo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigFive.class);

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
