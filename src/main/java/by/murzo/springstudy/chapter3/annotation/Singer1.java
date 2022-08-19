package by.murzo.springstudy.chapter3.annotation;

import org.springframework.stereotype.Component;

@Component("John Mayer")
public class Singer1 {
    private String lyric ="We found а message in а bottle we were drinking";

    public void sing() {
        System.out.println(lyric);
    }
}