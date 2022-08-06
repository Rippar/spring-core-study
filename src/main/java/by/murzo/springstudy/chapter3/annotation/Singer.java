package by.murzo.springstudy.chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {

    @Autowired
    private Inspiration inspirationBean;

    public void sign() {
        System.out.println("... " + inspirationBean.getLyric());
    }
}
