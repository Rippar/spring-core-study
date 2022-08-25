package by.murzo.springstudy.chapter4.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class HelloWorld {
    private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public void sayHi() {
        logger.info("Hello, world!");
    }
}
