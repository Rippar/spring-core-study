package by.murzo.springstudy.chapter3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        Map<String,Singer1> beans = ctx.getBeansOfType(Singer1.class);
        beans.entrySet().stream().forEach(b -> System.out.println("id: "+ b.getKey()));
        ctx.close();
    }
}
