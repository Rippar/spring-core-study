package by.murzo.springstudy.chapter3.config;

import by.murzo.springstudy.chapter3.BookwormOracle;
import by.murzo.springstudy.chapter3.Oracle;
import by.murzo.springstudy.chapter3.annotation.Singer1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {
        @Bean(name = {"johnMayer","john","jonathan","johnny"})
        public Singer1 singer1() {
            return new Singer1();
        }

    }


    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class);
        Map<String, Singer1> beans = ctx.getBeansOfType(Singer1.class);
        beans.entrySet().stream().forEach(b -> System.out.println("id: "
                + b.getKey()
                + "\n aliases: "
                + Arrays.toString(ctx.getAliases(b.getKey()))
                + "\n"));
        ctx.close();
    }


}
