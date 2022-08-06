package by.murzo.springstudy.chapter3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context-annotation.xml");
        ctx.refresh();

        Singer singerBean = ctx.getBean("singer", Singer.class);
        singerBean.sign();
        ctx.close();
    }
}
